package javaprograms;

import java.util.Scanner;

public class Que25 {

	public static void main(String[] args) 
	{
		int c;
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Enter a Num: ");
			int n = scan.nextInt();
			for(c=1;c<=10;c++)
			{
//		System.out.println(n+"*"+c+"="+(n*c));

				System.out.print(n*c + " ");
			}

			scan.close();
		}
	}

}
