package com.nik;

import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;

import org.json.JSONArray;
import org.json.JSONObject;

import com.jayway.jsonpath.JsonPath;

public class App {
	public static void main(String[] args) {
		JSONArray newReqBody = new JSONArray();
		JSONObject newRequest = new JSONObject();
		String legacyRequest = "";
		try {
			legacyRequest = new String(Files.readAllBytes(Paths.get("oldRequest.txt")));
			FileReader mappingFile = new FileReader("mapping.properties");
			Properties properties = new Properties();
			properties.load(mappingFile);

			JSONObject newRequestTemplate = new JSONObject(properties.getProperty("orderServiceRequest"));
			System.out.println(newRequestTemplate.keySet());
			for (String key : newRequestTemplate.keySet()) {
				if (newRequestTemplate.getString(key).contains("$")) {
					newRequest.put(key, JsonPath.read(legacyRequest, newRequestTemplate.getString(key)));
				} else {
					newRequest.put(key, newRequestTemplate.getString(key));

				}
			}
			newReqBody.put(newRequest);
			Files.write(Paths.get("newRequest.txt"), newReqBody.toString().getBytes());
			System.out.println("done");
			System.out.println(newReqBody);

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
