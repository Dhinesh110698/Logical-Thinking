package com.Printing;

public class PrintSquarerootOfNnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no=81;
		int div=2;
		while(div<=(no/2))
		{
			if(no/div==div)
			{
				System.out.println(div+"  root");
				break;
			}
			div++;
		}
		
		

	}

}
