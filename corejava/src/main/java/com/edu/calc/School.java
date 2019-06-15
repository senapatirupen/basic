package com.edu.calc;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;

public class School {
	
	private HashMap<String, String > nameage = new HashMap<String, String>();

	public static void main(String[] args) {
		System.out.println("hi");
		School sl = new School();
		sl.storValue();
		sl.showNameAge();
	}
	public void storValue(){
		nameage.put("alok1", "10");
		nameage.put("alok2", "20");
		nameage.put("alok3", "30");
	}
	
	public void showNameAge(){
//		Set<String> names = new HashSet<String>();
		for(Entry<String, String> name1: nameage.entrySet()){
			System.out.println(name1.getValue());
			System.out.println(name1.getKey());
			System.out.println("Name :"+name1.getKey()+"::"+"Age :"+name1.getValue());
		}
	}
}
