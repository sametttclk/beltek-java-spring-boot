package com.beltek.game;

import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int aranan =(int) (Math.random() * 100);
		Scanner scanner = new Scanner(System.in);
		System.out.println("Oyun Başladı! 0 ile 100 arasında bir sayı girin");
		int tahmin;
		for (int i = 0; i < 10; i++) {
			tahmin = scanner.nextInt();
			if (tahmin < aranan) {
				System.out.println("yukarı");
			}else if(tahmin >aranan){
				System.out.println("aşağı");
			}else {
				System.out.println("Tebrikler aranan sayıyı buldunuz");
				break;
			}
			
		}
		System.out.println("Oyuna Tekrar Başlayın");
	}

}
