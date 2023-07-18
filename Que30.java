package javaprograms;
import java.util.Scanner;

public class Que30 {

	public static void main(String[] args) 
	{
	try (Scanner scan = new Scanner(System.in)) {
		String str = scan.nextLine();
		
		StringBuilder stringBuilder = new StringBuilder(str);

		stringBuilder.reverse();
		String reversedString = stringBuilder.toString();

		System.out.println("Original String: " + str);
		System.out.println("Reversed String: " + reversedString);

		scan.close();
	}
	}
}
