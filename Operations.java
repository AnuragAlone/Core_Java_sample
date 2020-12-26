package com.test;

public class Operations {
			
			public static int addition(int a, int b) {
					return a+b;
			}
			public static int substraction(int a, int b) {
					return a-b;
			}
			public static int multiplication(int a, int b) {
					return a*b;
			}
			public static int division(int a, int b) {
						return a/b;
	}
	public static void main(String[] args) {
		int a,b,c;
		
		Operations op=new Operations();
		System.out.println(op.addition(4, 2));
		System.out.println(op.substraction(4, 2));
		System.out.println(op.multiplication(4, 2));
		System.out.println(op.division(4, 2));
	}

}
