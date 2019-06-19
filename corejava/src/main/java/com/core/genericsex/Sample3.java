package com.core.genericsex;

public class Sample3<T extends Number> {
	T[] obj;

	Sample3(T[] t) {
		this.obj = t;
	}
	
	double getAvarage(){
		double sum = 0.0;
		for(int i=0; i< obj.length; i++)
			sum +=obj[i].doubleValue();
		return sum/obj.length;
	}
	
	//wildcard implementation
	boolean sameAvg(Sample3<?> obj2){
		if(getAvarage() == obj2.getAvarage())
			return true;
		return false;
	}

}
