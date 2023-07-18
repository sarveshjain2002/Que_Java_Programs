package javaprograms;

import java.util.Scanner;

public class Que20 {

	public static void main(String[] args) 
	{
	int rev=0;
	Scanner scan = new Scanner(System.in);
	System.out.print("Enter a Number: ");
	int a= scan.nextInt();
	
	while(a!=0)//a=123
	{
		rev=rev*10;		//rev=0*10=10
		rev=rev+a%10;	//rev=0+123%10=3
		a=a/10;			//123/10=12 ...loop will be continued
	}
	scan.close();
	System.out.println("Reveresed Num: "+rev);
			
	}

}
