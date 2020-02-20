package com.Printing;

public class PrintSumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no=121;
		int rem=0;
		int rev=0;
		while(no>0)
		{
			rem=no%10;
			rev=rev+rem;
			no=no/10;
			//noOfDigits++;
		}
		//System.out.println();
		//System.out.println(noOfDigits);
		System.out.println(rev);

	}

}
