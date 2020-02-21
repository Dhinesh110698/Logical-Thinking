package com.Printing;

public class PrintFibonacciiSerious {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int first=0;
		int second=1;
		System.out.println(first);
		System.out.println(second);
		int third=0;
		for(int i=2;i<=10;i++)
		{
		/*	third=first+second;
			System.out.println(third);
			first=second;
			second=third; */ // use third variable
			second=first+second;
			System.out.println(second);
			first=second-first;    // use only two variables
			
		}

	}

}
