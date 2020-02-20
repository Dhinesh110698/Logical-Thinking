package com.Printing;

public class PrintSmallestDiviserOfGivenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no=11;
		int div=2;
		while(div<=no)
		{
			if(no%div==0) {
				System.out.println(div);
			break;
			}
			div++;
		}
	}

}
