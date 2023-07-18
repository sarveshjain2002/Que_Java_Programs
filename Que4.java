package javaprograms;
//How to get Using input using Scanner
//Program in java

import java.util.Scanner;

public class Que4 {

	public static void main(String args[])
	{
	int a;
	float b;
	String s;
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter a string");
	s = scan.nextLine();
	System.out.println("You entered string "+s);
	
	System.out.println("Enter an integer");
	a = scan.nextInt();
	System.out.println("You entered integer "+a);
	
	System.out.println("Enter a float");
	b = scan.nextFloat();
	System.out.println("You entered float "+b);
	scan.close();
	}

}
