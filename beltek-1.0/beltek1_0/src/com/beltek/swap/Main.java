package com.beltek.swap;

public class Main {

	public static void main(String[] args) {
		int a = 5;
		int b = 6;
		System.out.println("a =" + a);
		System.out.println("b =" + b);
		System.out.println("How to swap a to b without new variable");
		
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("a =" + a);
		System.out.println("b =" + b);

	}

}
