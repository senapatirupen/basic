package com.core.basic;

public class Example {

	public static void main(String[] args) {
		System.out.println("This is a smaple program");
//		forEachTest();
//		switchTest();
//		avarage();
//		numCalc1();
//		sqrtTest();
//		charTest();
//		area();
//		numCalc();
//		xAndYCalc();
//		forTest();
	}
	
	public static void goToTest(){
		first:{
		System.out.println("inside first");
			second:{
				System.out.println("inside second");
				break second;
			}
		}
	}
	
	public static void forEachTest(){
		int sum = 0;
		int num[][] = new int[3][5];
		for(int i=0; i<3; i++){
			for(int j=0; j<5; j++){
				num[i][j]=(i+1)*(j+1);
			}
		}
		
		//for each to display the value
		for(int x[]: num){
			for(int y: x){
				System.out.println(" The value is: "+y);
				sum += y;
			}
		}
		System.out.println("sum of numbers: "+sum);
	}
	
	public static void switchTest(){
		String name = "Alok";
		switch(name){
			case "Alok":{
				System.out.println("find the name");
			}
			break;
			case "Gudu":{
				System.out.println("still searching");
			}
			break;
			default:{
				System.out.println("more name require");
			}
		}
	}
	
	public static void avarage(){
		double nums[] = {11.2, 22.3,33.4,44.5,55.6,66.7};
		double result =0;
		for(int i=0;i<5;i++){
			result = result+nums[i];
		}
		System.out.println("Avrage of numbers: "+result/5);
	}
	
	public static void numCalc1(){
		byte b=42;
		char c='a';
		short s=1024;
		int i=50000;
		float f=5.67f;
		double d=.1234;
		double result=(f*b)+(i/c)-(d*s);
		System.out.println(result);
		/*In	the	fi rst 	subexpression,	f	*	b,	b	i s	promoted	to	a	float	and	the	resul t 	of	the
		subexpression	i s	float.	Next ,	in	the	subexpression	i /c,	c	i s	promoted	to	int,	and
		the	resul t 	i s	of	type	int.	Then,	in	d	*	s,	the	value	of	s	i s	promoted	to	double,
		and	the	type	of	the	subexpression	i s	double.	Final ly,	these	three	intermediate
		values,	float,	int,	and	double,	are	considered.	The	outcome	of	float	plus	an	int
		i s	a	float.	Then	the	resul tant 	float	minus	the	last 	double	i s	promoted	to	double,
		which	i s	the	type	for	the	final 	resul t 	of	the	expression.*/
	}
	
	public static void sqrtTest(){
		double a=3.0, b=4.0;
		double c=Math.sqrt(a * a + b * b);
		System.out.println("Square root: "+c);
	}
	
	public static void charTest(){
		char ch1,ch2,ch3;
		ch1=88;
		ch2='y';
		ch3 = ch2++;
		System.out.println("showing ch1 : "+ch1+" ch2: "+ch2+" ch3: "+ch3);
	}
	
	public static void area(){
		double pi,a,r;
		pi=3.141;
		r=10.4;
		a=pi*r*r;
		System.out.println("area : "+a);
	}
	
	public static void numCalc(){
		int num = 10;
		num = num * 2;
		System.out.println(" final num value: "+num);
	}
	
	public static void xAndYCalc(){
		int x,y;
		x=10;
		y=20;
		if(x<y)
			System.out.println("x is less than y");
		x=x*2;
		if(x==y)
			System.out.println("x is equal to y");
		x=x*2;
		if(x>y)
			System.out.println("x is greter than y");
		if(x==y)
			System.out.println("this won't display");
	}
	public static void forTest(){
		int x;
		for(x=0;x<10;x++){
			System.out.println("Current x value: "+x);
		}
	}
}
