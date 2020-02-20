package com.Printing;

public class PrintPrimenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	int i, number = 1, count; 
		while(number <= 100)
		{
			count = 0;
			i = 2;
		    while(i <= number/2 )
		    {
		    	if(number % i == 0)
		    	{
		    		count++;
		    		break;
		    	}
		    	i++;
		    }
		    if(count == 0 && number != 1 )
		    {
		    	System.out.print(number + " ");
		    }
		    number++;

	}*/
int no=99;
if((no!=2)&&no%2==0)
{
	System.out.println("not prime");
}
else
{
	int count=3;
	while(count<no)
	{
		if(no%count==0)
		{
			System.out.println(" non prime");
		}
		count=count+1;
	}
}
}
}