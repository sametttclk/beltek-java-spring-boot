package com.beltek.graduate;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int vizeNotu, finalNotu;
		String ad, soyad;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen Adınızı Giriniz");
		ad = scanner.next();
		System.out.println("Lütfen Soyadınızı Giriniz");
		soyad = scanner.next();
		System.out.println("Lütfen ilk notunuzu giriniz");
		vizeNotu = scanner.nextInt();
		System.out.println("Lütfen ikinci notunuzu giriniz");
		finalNotu = scanner.nextInt();
		Double sonuç =vizeNotu * 0.3 + finalNotu * 0.7;
		System.out.println("Sonucunuz =" + sonuç);
		if(sonuç >= 0 && sonuç <= 50) {
			System.out.println("Sınıfta kaldınız");
		}else if(sonuç > 50 && sonuç <= 100){
			System.out.println("Sınıfı başarılı geçtiniz");
		}else {
			System.out.println("Yanlış bir değer girdiniz");
		}
 
	}

}
