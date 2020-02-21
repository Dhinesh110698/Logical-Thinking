package com.Printing;

public class PrintSpyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no=1124;
		int sum=0;
		int prod=1;
		int rem=0;
		while(no>0)
		{
			rem=no%10;
			sum=sum+rem;
			prod=prod*rem;
			no=no/10;
		}
		System.out.println(sum);
		System.out.println(prod);
	}

}
