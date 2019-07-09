package com.core.inheritanceex;

public class A {

	int x;

	public static void find() {
		System.out.println("A.find()");
	}

	public static void go() {
		System.out.println("A.go()");
	}

	public A() {
		System.out.println("Inside A");
	}

	public A(int x) {
		this.x = x;
	}

	public void display() {
		System.out.println("A.display()");
	}

	public void show() {
		System.out.println("A.show()");
	}

	public final void result() {
		System.out.println("A.result");
	}
}
