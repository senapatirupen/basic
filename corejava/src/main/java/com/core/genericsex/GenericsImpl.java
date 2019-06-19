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
		
		Sample2<Integer, String> s2 = new Sample2<Integer, String>(12, "Ok");
		s2.showTypeAndValue();
		
		Sample3<Double> s3 = new Sample3<Double>(new Double[]{1.0, 2.0});
		s3.getAvarage();
		Sample3<Integer> s31 = new Sample3<Integer>(new Integer[]{1, 2});
		s31.getAvarage();
		
		//wildcard implementation
		s31.sameAvg(s3);
		
		Sample4.isInArray(1, new Integer[]{1,2,3});
		
		
	}
}
