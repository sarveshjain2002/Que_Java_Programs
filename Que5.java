package javaprograms;
import java.util.Scanner;
public class Que5 {

	public static void main(String[] args) 
	{
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter Temperature: ");
	int temp=scan.nextInt();
	
	temp=((temp-32)*5)/9;
	
	System.out.print("Temperature in Celsius: "+temp);
			scan.close();
	}

}
