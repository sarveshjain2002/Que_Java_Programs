package javaprograms;

import java.util.Scanner;

public class Que19 
{
	public static void main(String[] args) 
	{
		int n;
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Input an Integer:");
		
		while((n=scan.nextInt())!=0)
		{
			System.out.println("You Entered"+ n);
			System.out.println("Input an Integer");
		}
		System.out.println("Out of Loop");
		scan.close();
		
	}
}


