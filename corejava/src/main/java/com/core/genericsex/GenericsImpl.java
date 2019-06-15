package com.core.genericsex;

public class GenericsImpl {

	public static void main(String[] args) {
		new GenericsImpl().sampleTest();
	}
	
	public void sampleTest(){
		Sample<Integer> sm = new Sample<Integer>(10);
		sm.showType();
		
		Sample<String> ms = new Sample<String>("alok");
		ms.showType();
		
	}
}
