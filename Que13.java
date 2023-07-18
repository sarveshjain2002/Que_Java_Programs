package javaprograms;

import java.util.Scanner;
public class Que13 {

	public static void main(String[] args) 
	{
	int x;
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter a Num: ");
	x=scan.nextInt();
	
	if(x%2==0)//(x%2!=0)
	{
		System.out.println("Number is Even");
	}
	else
	{

		System.out.println("Number is Odd");
	}
	scan.close();
	
	}

}
