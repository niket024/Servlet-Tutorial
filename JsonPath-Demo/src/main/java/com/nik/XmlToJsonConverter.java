package com.nik;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.json.XML;

public class XmlToJsonConverter {
	public static void main(String[] args) {
		String legacyRequest;
		String jsonReq = "";
		try {
			legacyRequest = new String(Files.readAllBytes(Paths.get("legacyXmlRequest.txt")));
			jsonReq = XML.toJSONObject(legacyRequest).toString();
			Files.write(Paths.get("xmlToJson.txt"), jsonReq.toString().getBytes());

		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(jsonReq);

	}
}
