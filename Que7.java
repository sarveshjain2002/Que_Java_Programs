package javaprograms;

import java.util.Scanner;
public class Que7 {

	public static void main(String[] args) 
	{
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter 2 Number: ");

	int a=scan.nextInt();
	int b=scan.nextInt();
	
	System.out.println("Before Swapping \nx=" +a+"\ny= "+b);
	//a=10  b=20
	a=a-b;//a=10-20=-10 //a=-10
	b=a+b;//b=-10+20 //b=10
	a=b-a;//a=10-(-10)//a=20

	System.out.println("After Swapping \nx=" +a+"\ny= "+b);
	scan.close();
	
	}

}
