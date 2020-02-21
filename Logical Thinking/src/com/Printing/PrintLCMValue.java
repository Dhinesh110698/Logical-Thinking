package com.Printing;

public class PrintLCMValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no1=7,no2=17;
		int small=no1<no2?no1:no2;
		int big=no1>no2?no1:no2;
		int big2=big;
		while(true)
		{
			if(big%small==0)
			{
				System.out.println(big);
				break;
			}
			big=big+big2;
		}

	}

}
