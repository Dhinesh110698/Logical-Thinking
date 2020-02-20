package com.Printing;

public class PrintPrimenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i, number = 1, count; 
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

	}
/*int no=97,div=3;
boolean check =true;
if (no%2!=0)
{
	while (div<no)
	{
		if(no%div==0)
		{
			System.out.println("not prime");
			check=false;
			break;
		}
		div=div+2;
		}
	if(check==true)
	{
		System.out.println("prime");
	}
}
else
{
	System.out.println("not prime");
		
}*/
}
}