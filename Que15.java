package javaprograms;

import java.util.Scanner;
public class Que15 {

	public static void main(String[] args) 
	{
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter first String:");
	String a = scan.nextLine();
	
	System.out.println("Enter second String: ");
	String b = scan.nextLine();
	
	if(a.compareTo(b)>0)
	{
		System.out.println("First String is Larger");
	}
	else if(a.compareTo(b)<0)
	{
		System.out.println("Second String is Larger");
	}
	else
	{
		System.out.println("Strings are same");
	}
	scan.close();

	}
	}
