package com.core.genericsex;

public class Sample<T> {
	T obj;

	Sample(T t) {
		this.obj = t;
	}
	
	T getType(){
		return obj;
	}
	
	void showType(){
		System.out.println("The current class type: "+obj.getClass().getName());
	}

}
