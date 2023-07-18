package javaprograms;
import java.util.Scanner;
public class Que28 {

	public static void main(String[] args) 
	{
		int num = 1;
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Enter the number of rows of floyd's triangle you want: ");
			int n = scan.nextInt();
			System.out.println("Floyd's triangle :-");
			
			for ( int c = 1 ; c <= n ; c++ )
			{
			for (int d = 1 ; d <= c ; d++ )
			{
			System.out.print(num+" ");
			num++;
			}
			System.out.println();
			}
			scan.close();	}
	}

}
