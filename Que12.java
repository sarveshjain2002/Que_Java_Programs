package javaprograms;
import java.util.Scanner;
public class Que12 
{
public static void main(String args[])
{
	int marksObtained; 
	int passingMarks=40;
	int Presenty=15;
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter Marks Obtained: ");
	marksObtained=scan.nextInt();

	System.out.println("Enter Presenty Till Now : ");
	Presenty=scan.nextInt();
	
	if(marksObtained >= passingMarks)
	{
		System.out.println("Congrats!!! You are Passed ");
	}
	else if(Presenty>=15)
	{
		System.out.println("Keep it up!!!");
	}
	else
	{
		System.out.println("Unfortunately, You are Failed!!!");
	}
	scan.close();
}
}
