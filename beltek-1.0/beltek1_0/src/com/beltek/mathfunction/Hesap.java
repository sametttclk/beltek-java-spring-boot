package com.beltek.mathfunction;

public class Hesap {
	public void toplama(int a, int b) {
		System.out.print(a + "+" + b +"=");
		yazma(a+b);
	}
	public void çıkarma(int a, int b) {
		System.out.print(a + "-" + b +"=");
		yazma(Math.abs(a-b));
	}
	public void çarpma(int a, int b) {
		System.out.print(a + "*" + b +"=");
		yazma(a*b);
	}
	public void bölme(int a, int b) {
		System.out.print(a + "/" + b +"=");
		yazma(a/b);
	}
	public void yazma(int result) {
		System.out.println
		(result);
	}

}
