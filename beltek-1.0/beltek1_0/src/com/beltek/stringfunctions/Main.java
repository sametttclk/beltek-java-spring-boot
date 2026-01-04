package com.beltek.stringfunctions;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		String str1 = "Hello World";
		String str2 = "Hello World";
		if (str1 == str2) {
			System.out.println("TRUE");
		}else {
			System.out.println("FALSE");
		}
		
		System.out.println("******************");


		long starts = System.currentTimeMillis();
		String string = "a";
		for (int i = 0; i < 1000; i++) {
			string = string + "a";
		}
		long ends = System.currentTimeMillis();
		System.out.println(ends - starts);
		
		
		System.out.println("******************");

		long starts1 = System.currentTimeMillis();
		StringBuffer buffer = new StringBuffer("a");
		for (int i = 0; i < 10000000; i++) {
			buffer.append("a");
		}
		long ends1 = System.currentTimeMillis();
		System.out.println(ends1 - starts1);
		
		System.out.println("******************");

		long starts2 = System.currentTimeMillis();
		StringBuilder builder = new StringBuilder("a");
		for(int i = 0; i < 10000000; i++) {
			builder.append("a");
		}
		long ends2 = System.currentTimeMillis();
		System.out.println(ends2 - starts2);
	}

}
