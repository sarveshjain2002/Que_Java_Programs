package javaprograms;

import java.util.Scanner;
public class Que14 {

	public static void main(String[] args) 
	{
	int n, fact=1;	
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter a Num to cal Fact: ");
	n=scan.nextInt();
	
	if(n<0)
	{
		System.out.println("Number Should be Non-Negative: "+n);
	}
	else
	{
		for(int c=1;c<=n;c++)//n=5   
		{
			fact=fact*c;
		}

		System.out.println("Factorial of "+n+ " is ="+fact);	
	}
	scan.close();
	}
}
