package com.core.inheritanceex;

public class B extends A {

	int y;

	public static void find() {
		System.out.println("B.find()");
	}

	public B() {
		System.out.println("Inside B");
	}

	public B(int x, int y) {
		super(x);
		this.y = y;
	}

	public void display() {
		System.out.println("B.display()");
	}

	public void showValue() {
		System.out.println("B.showValue()");
	}

	// compilation error
	// public void result() {
	// System.out.println("B.result()");
	// }

	public void sum() {
		System.out.println("B.sum(): " + (x + y));
	}

}
