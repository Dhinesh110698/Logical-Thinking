package com.Swapping;

public class Swapp3variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=2;
		int b=3;
		int c=4;
		a=a+b+c;
		b=a-(b+c);
		c=a-(b+c);
		a=a-(b+c);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}

}
