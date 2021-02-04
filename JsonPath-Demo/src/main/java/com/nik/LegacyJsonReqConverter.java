package com.nik;

import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;

import org.json.JSONArray;
import org.json.JSONObject;

import com.jayway.jsonpath.JsonPath;

public class LegacyJsonReqConverter {
	public static void main(String[] args) {
		String legacyRequest = "";
		try {
			legacyRequest = new String(Files.readAllBytes(Paths.get("legacyJsonRequest.txt")));
			
			FileReader mappingFile = new FileReader("mapping.properties");
			Properties properties = new Properties();
			properties.load(mappingFile);

			JSONObject newRequestTemplate = new JSONObject(properties.getProperty("orderServiceRequest"));
			System.out.println(newRequestTemplate.keySet());
			JSONObject newRequest = new JSONObject();
			for (String key : newRequestTemplate.keySet()) {
				if (newRequestTemplate.getString(key).contains("$")) {
					newRequest.put(key, JsonPath.read(legacyRequest, newRequestTemplate.getString(key)));
				} else {
					newRequest.put(key, newRequestTemplate.getString(key));
				}
			}
			JSONArray newReqBody = new JSONArray();
			newReqBody.put(newRequest);
			Files.write(Paths.get("orderServiceRequestnewReq.txt"), newReqBody.toString().getBytes());
			System.out.println("done");
			System.out.println(newReqBody);

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
