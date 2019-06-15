package com.corejava.jsonutil;

import java.io.File;

import org.json.simple.parser.JSONParser;

public class LoadJsonFile {

	public void load(){
		JSONParser parser = new JSONParser();
		ClassLoader loader = LoadJsonFile.class.getClassLoader();
		File file = new File(loader.getResource("json/input.json").getFile());
	}
}
