package com.Printing;

public class PrintSumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	int no=12345;
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
		System.out.println(rev);*/

//below programm is single digit adding of sumofdigits  		
		int no=12345;
		int sum=0;
		do
		{
		 sum=0;
		while(no>0)
		{
			int rem=no%10;
			sum=sum+rem;
			no=no/10;
		}
        no=sum;
}while(sum>9);
		System.out.println(sum);
}
}