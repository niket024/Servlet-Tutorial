package com.nik;

import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.XML;

import com.jayway.jsonpath.JsonPath;

public class LegacyXmLReqConverter {
	public static void main(String[] args) {
	
		String legacyXmlRequest = "";
		String jsonReq = "";
		try {
			legacyXmlRequest = new String(Files.readAllBytes(Paths.get("legacyXmlRequest.txt")));
			jsonReq = XML.toJSONObject(legacyXmlRequest).toString();
			System.out.println(jsonReq);
			
			FileReader mappingFile = new FileReader("mapping.properties");
			Properties properties = new Properties();
			properties.load(mappingFile);
			
			JSONObject newRequestTemplate = new JSONObject(properties.getProperty("personDetails"));
			JSONObject newRequest = new JSONObject();
			
			System.out.println(newRequestTemplate.keySet());
			for (String key : newRequestTemplate.keySet()) {
				if (newRequestTemplate.getString(key).contains("$")) {
					newRequest.put(key, JsonPath.read(jsonReq, newRequestTemplate.getString(key)));
				} else {
					newRequest.put(key, newRequestTemplate.getString(key));
				}
			}
			JSONArray newReqBody = new JSONArray();
			newReqBody.put(newRequest);
			Files.write(Paths.get("personDetailsnewReq.txt"), newReqBody.toString().getBytes());
			System.out.println(newReqBody);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
