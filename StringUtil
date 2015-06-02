package com.string.util;

import java.util.Arrays;
import java.util.List;

public class StringUtil {

	public static void main(String[] args) {
		StringUtil stringUtil = new StringUtil();
		stringUtil.stringFilter();
	}

	public void stringFilter() {
		String componentId = "9901.2234,3324,4434.TEXT";
		String[] ids = null;
		if (componentId.contains("TEXT") && componentId.contains(",")) {
			List<String> components = Arrays.asList(componentId.split("\\."));
			if (components.get(1).contains(",")) {
				List<String> componentsOne = Arrays.asList(components.get(1)
						.split(","));
				ids = new String[componentsOne.size()];
				for (int i = 0; i < componentsOne.size(); i++) {
					ids[i] = components.get(0) + "." + componentsOne.get(i)
							+ "." + "TEXT";
					System.out.println(ids[i]);
				}
			}
		}
		//Expected out put :
		//9901.2234.TEXT
		//9901.3324.TEXT
		//9901.4434.TEXT
	}
	
}
