package javaprograms;
import java.util.Scanner;
public class Que11 
{
public static void main(String args[])
{
	int marksObtained; 
	int passingMarks=40;
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter Marks Obtained: ");
	marksObtained=scan.nextInt();
	
	if(marksObtained >= passingMarks)
	{
		System.out.println("You are Passed ");
	}
	else
	{
		System.out.println("You are Failed!!!");
	}
	scan.close();
}
}
