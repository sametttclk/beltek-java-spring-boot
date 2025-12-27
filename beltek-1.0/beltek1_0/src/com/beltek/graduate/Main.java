package com.beltek.graduate;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int not1, not2;
		String ad, soyad;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen Adınızı Giriniz");
		ad = scanner.next();
		System.out.println("Lütfen Soyadınızı Giriniz");
		soyad = scanner.next();
		System.out.println("Lütfen ilk notunuzu giriniz");
		not1 = scanner.nextInt();
		System.out.println("Lütfen ikinci notunuzu giriniz");
		not2 = scanner.nextInt();
		Double sonuç =not1 * 0.3 + not2 * 0.7;
		System.out.println("Sonucunuz =" + sonuç);

	}

}
