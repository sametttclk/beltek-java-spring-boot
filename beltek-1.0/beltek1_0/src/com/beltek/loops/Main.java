package com.beltek.loops;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		System.out.println("For");
		for (int i = 0; i < 10; i++) {
			if(i%2 != 0) {
			System.out.println(i);
			}
		}
		System.out.println("While");
		int j = 0;
		while (j < 10) {
			if(j%2==0) {
				System.out.println(j);
			}
			j++;
		}
		System.out.println("Do-While");
		int k = 0;
		do {if (k%2==0) {
			System.out.println(k);
		}
			k++;
		} while (k < 10);
	}

}
