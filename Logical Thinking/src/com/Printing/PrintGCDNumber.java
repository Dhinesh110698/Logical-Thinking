package com.Printing;

public class PrintGCDNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no1=30,no2=15;
		int small=no1<no2?no1:no2;
	//	boolean common =true; this line only used for no common factors divisers
	//	int big=no1>no2?no1:no2;
		while(small>=2)
		{
		if((no1%small==0) &&(no2%small==0))
		{
		//	common=false;
			System.out.println("GCD  "+small);
			break;
		}
small--;		
}
	//	if(common==true)
	//	{
	//		System.out.println("no GCD");
	//	}

}
}