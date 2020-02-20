package com.Printing;

public class PrintFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int given=5;
		do
			{
			int fact=1;
		int number=1;
		while(number<=given)
		{
			fact=fact*number;
			number=number+1;
		}
System.out.println(fact);
given=given-1;
	}while(given>0);


		/*int fact=1;
		int number=1;
		while(number<=5)
		{
			fact=fact*i;
           number=number+1;
		}
System.out.println(fact);*/

	}

}
