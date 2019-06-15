package com.core.lambdaex;

public class ExOne {

	public static void main(String[] args) {
		new ExOne().getValueTest();
		ExOne.stringOpImpl();
		ExOne.stringOprsImpl();
		new ExOne().stringOprsImplOne();
	}

	public void getValueTest() {
		// The lambda expression is simply a constant expression.
		// When it is assigned to myNum, a class instance is constructed in
		// which the lambda expression implements the getValue() method in
		// MyNumber.
		MyNumber myNumber;
		myNumber = () -> 2.141;
		System.out.println(myNumber.getValue());

		myNumber = () -> Math.random() * 100;
		System.out.println(myNumber.getValue());

		// myNumber = () -> "12.3"; error

		NumaricTest numTest;
		numTest = (a) -> (a % 2) == 0;
		System.out.println(numTest.test(10));

		NumaricTest2 numTest2;
		numTest2 = (int a, int b) -> (a > b);
		System.out.println(numTest2.test(10, 20));

		NumaricTest3 numTest3 = (a) -> {
			int result = 1;
			for (int i = 1; i <= a; i++) {
				result = result * i;
			}
			return result;
		};

		GenericFun<String> genFun = (str) -> {
			String result = "";
			int i;
			for (i = str.length() - 1; i >= 0; i--) {
				result += str.charAt(i);
			}
			return result;
		};

		GenericFun<Integer> factorial = (n) -> {
			int result = 1;
			for (int i = 1; i <= n; i++) {
				result = i * result;
			}
			return result;
		};

	}

	// This method has a functional interface as the type of its parameter.
	// Thus, it can be passed a reference to any instance of that interface,
	// including the instance created by a lambda expression. The second
	// parameter specifies the string to operate on

	static String stringOp(StringTest st, String s) {
		return st.fun(s);
	}

	// implementation of stringOp
	static void stringOpImpl() {
		// single line implementation
		String result = stringOp((str) -> str.toUpperCase(), "sample string");
		System.out.println(result);

		// block line implementation
		String result1 = stringOp((str) -> {
			str.toUpperCase();
			str.toLowerCase();
			// some lines of code
			return str;
		}, "sample string");
		System.out.println(result1);

		// Now we can also pass already created functional interface with
		// lambdas
		StringTest genFun = (str) -> {
			String result2 = "";
			int i;
			for (i = str.length() - 1; i >= 0; i--) {
				result2 += str.charAt(i);
			}
			return result2;
		};

		// implementation
		String result4 = stringOp(genFun, "ok i am fine");
		System.out.println(result4);
	}

	// functional interface with exception
	public void exTest() throws EmptyArrayException {
		double[] values = { 1.0, 2.0, 3.0, 4.0 };

		DoubleNumaricArrayFunc avarage = (n) -> {
			double sum = 0;
			if (n.length == 0)
				throw new EmptyArrayException();
			for (int i = 0; i < n.length; i++) {
				sum += n[i];
			}
			return sum / n.length;
		};

		System.out.println("avarage of the numbers" + avarage.fun(values));
	}

	int num = 10;

	// Lambda Expressions and Variable Capture
	public void effFinalVar() {
		NumaricTest3 numt = (n) -> {
			// it is fine
			int v = num + n;
			// however, the following is illegal because it attempts to modify
			// the value of num
			num++;
			// The following line would also cause an error, because it would
			// remove the effectively final status from num
			num = 9;
			return v;
		};
	}

	// A method reference provides a way to a method without executing it. It
	// related to lambda expressions because it, too requires a target type
	// context that consists of a compatible functional interface. When
	// evaluated, a method reference also creates an instance of the functional
	// interface.

	// Method references to static Method
	// To create a static method reference, use this general
	// syntax:ClassName::methodName
	static String stringOprs(StringTest st, String s) {
		return st.fun(s);
	}

	// method references implementation through static
	static void stringOprsImpl() {
		String out = stringOprs(MyStringOps::strReverse, "i am fine >>>");
		System.out.println(out);
	}

	// method references implementation through object
	MyStringOps mso = new MyStringOps();

	void stringOprsImplOne() {
		String out = stringOprs(mso::strReverseOne, "i am fine >>>");
		System.out.println(out);
	}
	
	void constructorMethImpl(){
		StringTest2 st2 = MyStringOps2::new;
		MyStringOps2 mso2 = st2.fun("i am ok >>>");
		System.out.println(mso2.strReverseOne("ok"));
	}
	
}
