package com.nik;

import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import com.google.gson.Gson;
import com.jayway.jsonpath.JsonPath;

public class ResponseComprator {
	public static void main(String[] args) {
		String legacyResponse = "";
		String newResponse = "";
		try {
			legacyResponse = new String(Files.readAllBytes(Paths.get("legacyResponse.txt")));
			newResponse = new String(Files.readAllBytes(Paths.get("newResponse.txt")));
			FileReader mappingFile = new FileReader("responsemapping.properties");
			Properties properties = new Properties();
			properties.load(mappingFile);
			System.out.println(properties.keySet());
			Set<String> responsevalue = new HashSet<String>();
			Map<String, String> legacyMap = new HashMap<String, String>();
			Map<String, String> newMap = new HashMap<String, String>();
			for (Object key : properties.keySet()) {
				String[] newArr = key.toString().split("\\.");
				String[] legacyArr = properties.getProperty((String) key).split("\\.");
				String legacyValue = JsonPath.read(legacyResponse, properties.getProperty((String) key));
				String newValue = JsonPath.read(newResponse, key.toString());
				responsevalue.add(legacyValue);
				if (responsevalue.add(newValue)) {
					legacyMap.put(legacyArr[legacyArr.length - 1], legacyValue);
					newMap.put(newArr[newArr.length - 1], newValue);
				}
			}
			if (legacyMap.size() > 0) {
				String resultJson = new Gson().toJson(new ResponseMatcher(legacyMap, newMap, false));
				System.out.println(resultJson);
			}else {
				System.out.println("Response matched");
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
