package com.Printing;

public class PrintNeonNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no=9;
		int suquare=(no*no);
		int sum=0;
		while(suquare>0)
		{
			int rem=suquare%10;
			sum=sum+rem;
			suquare=suquare/10;
		}
if(sum==no)
{
	System.out.println("neon");
}
	}

}
