package com.beltek.chainmethod;

public class ChainMath {
	    private int a;
	    private int b;

	    public ChainMath setNumbers(int a, int b) {
	        this.a = a;
	        this.b = b;
	        return this;
	    }

	    public ChainMath toplama() {
	        System.out.println(a + " + " + b + " = " + (a + b));
	        return this;
	    }

	    public ChainMath cikarma() {
	        System.out.println(a + " - " + b + " = " + (a - b));
	        return this;
	    }

	    public ChainMath carpma() {
	        System.out.println(a + " * " + b + " = " + (a * b));
	        return this;
	    }

	    public ChainMath bolme() {
	        if (b == 0) {
	            System.out.println("Bölme hatası: 0'a bölünemez");
	        } else {
	            System.out.println(a + " / " + b + " = " + (a / b));
	        }
	        return this;
	    }

	    public static void main(String[] args) {
	        new ChainMath()
	                .setNumbers(20, 5)
	                .toplama()
	                .cikarma()
	                .carpma()
	                .bolme();
	    }
}