package com.Printing;

public class PrintReverseGivenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no=121;
		int no1=121;
		int noOfDigits=0;
		int rem=0;
		int rev=0;
		while(no>0)
		{
			rem=no%10;
			rev=(rev*10)+rem;
			no=no/10;
			//noOfDigits++;
		}
		//System.out.println();
		//System.out.println(noOfDigits);
		System.out.println(rev);
		if(rev==no1)
		{
			System.out.println("palindrome");
		}
	}

}
