package javaprograms;
import java.util.Scanner;
public class Que26 {
//Prime Number
	public static void main(String[] args) 
	{
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Enter a Number: ");
			int num = scan.nextInt();
			boolean flag = false;
			 if(num==1)
			 {
						 System.out.println("Number is Prime");
			 }
			for (int i = 2; i <= num / 2; ++i) //num=13/2=6.5
			{
			  // condition for nonprime number
			  if (num % i == 0) //num=6.5/2!=0
			  {
			    flag = true;
			    break;
			  }
			}

			if (!flag)
			  System.out.println(num + " is a prime number.");
			else
			  System.out.println(num + " is not a prime number.");
		}
	  }
	}


