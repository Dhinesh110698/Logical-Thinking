package com.Printing;

public class PrintArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no=153;
		int no2=no;
		int arm=0;
		while(no>0)
		{
			int rem=no%10;
			arm=arm+(rem*rem*rem);
			no=no/10;
		}
if(no2==arm)
{
	System.out.println("armstrong");
}
	}

}
