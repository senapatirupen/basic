package com.core.inheritanceex;

public class InheritanceCheck2 {

	public static void main(String[] args) {
		Base base = new Derived();
		base.type();

		Derived derived = new Derived();
		derived.type();
	}
}