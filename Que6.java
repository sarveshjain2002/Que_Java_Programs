package javaprograms;

import java.util.Scanner;
public class Que6 {

	public static void main(String[] args) 
	{
		int x,y,temp;
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter 2 Number : ");
	x=scan.nextInt();
	y=scan.nextInt();
	
	System.out.println("Before Swapping \nx=" +x+"\ny= "+y);
	
	temp=x;
	x=y;
	y=temp;
	

	System.out.println(" ");

	System.out.println("After Swapping \nx=" +x+"\ny= "+y);
	scan.close();
	}

}
