package com.core.genericsex;

public class Sample2<T, V> {
	T obj;
	V obj2;

	Sample2(T t, V v) {
		this.obj = t;
		this.obj2 = v;
	}
	
	T getType(){
		return obj;
	}
	
	V getValue(){
		return obj2;
	}
	
	void showType(){
		System.out.println("The current class type: "+obj.getClass().getName());
	}
	
	void showTypeAndValue(){
		System.out.println("The current class type: "+obj.getClass().getName()+" The current class value: "+obj2.getClass().getName());
	}

}
