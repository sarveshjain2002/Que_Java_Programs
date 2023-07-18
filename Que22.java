package javaprograms;

import java.util.Scanner;
public class Que22 {

	public static void main(String[] args) 
	{
		int a;
	Scanner scan = new Scanner(System.in);
	while(true)
	{
		System.out.println("Input an Integer: ");
		a= scan.nextInt();
	
	if(a!=0)
	{
		System.out.println("You entered "+a);
		continue;
	}
	else {
		break;
	}
	
	}
}
}
