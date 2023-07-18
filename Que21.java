package javaprograms;

import java.util.Scanner;

public class Que21 {

	public static void main(String[] args) 
	{
	Scanner scan= new Scanner(System.in);
	
	while(true)
	{
		System.out.println("Input an Integer: ");
		int a= scan.nextInt();
			
	if(a==0||a==6)
	{
		System.out.println("Zero and Six is Skipped");
		break;
		
	}
	System.out.println("You entered: "+a);
	
	}
	scan.close();
}
}
