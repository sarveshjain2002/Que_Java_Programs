package javaprograms;

import java.util.Scanner;
public class Que8 
{
	public static void main(String[] args) 
	{
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first Num: ");
		int num1=scan.nextInt();

		System.out.println("Enter second Num: ");
		int num2=scan.nextInt();
		
		int result=num1+num2;
		System.out.println("Sum of Two :"+result);
		scan.close();

	}

}
