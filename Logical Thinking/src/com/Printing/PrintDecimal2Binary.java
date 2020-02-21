package com.Printing;

public class PrintDecimal2Binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no=4;
		String rem="";
		while(no>0)
		{
			rem=no%2+rem;
			no=no/2;
		}
System.out.println(rem);
	}

}
