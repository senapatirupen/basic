package com.core.inheritanceex;

public class InheritanceCheck {

	public static void main(String[] args) {
		A a = new B();
		a.display();
		a.show();
		A.find();
		A.go();

		B b = new B();
		b.display();
		b.show();
		b.showValue();
		B.find();
		B.go();
		B b2 = new B(10, 20);
		b2.sum();

	}
}