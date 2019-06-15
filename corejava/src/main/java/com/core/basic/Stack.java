package com.core.basic;

public class Stack {

	int stck[] = new int[10];
	int tos;
	//Initialize top of stack
	Stack(){
		tos = -1;
	}
	void pust(int item){
		if(tos > 10 ){
			System.out.println("Stack Over flow");
		} else {
			stck[++tos] = item;
		}
	}
	
	int pop(){
		if(tos < 0){
			System.out.println("Stack under flow");
			return 0;
		} else {
			return stck[tos--];
		}
	}
}
