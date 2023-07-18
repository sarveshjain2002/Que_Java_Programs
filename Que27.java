package javaprograms;
import java.util.Scanner;
public class Que27 
{
//ArmStrong Number
	public static void main(String[] args) 
{

		int originalNumber, remainder, result = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int number=scan.nextInt();
		
        originalNumber = number;//num=

        while (originalNumber != 0)
        {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 10;
        }

        if(result == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");

    	scan.close();    
}
}


