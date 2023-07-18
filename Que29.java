package javaprograms;
import java.util.Scanner;

public class Que29 {
//SubStrings in Java
	public static void main(String[] args) 
	{

		int i, c;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string to print it's all substrings");
		String string = scan.nextLine();
		int length = string.length();
		
		System.out.println("Substrings of \""+string+"\" are :-");
		for( c = 0 ; c < length ; c++ )
		{
		for( i = 1 ; i <= length - c ; i++ )
		{
		String sub = string.substring(c, c+i);
		System.out.println(sub);
		}
		}


	}

}
