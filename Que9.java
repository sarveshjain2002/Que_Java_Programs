package javaprograms;
import java.util.Scanner;
public class Que9 {

	public static void main(String[] args) 
	{
	int x,y,z;
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter three integer: ");
	
	x=scan.nextInt();
	y=scan.nextInt();
	z=scan.nextInt();
	
	if(x>y&&x>z)
	{
	System.out.println("First Num is Greatest");
	}
	else if(y>x&&y>z)
	{
		System.out.println("Second Num is Greatest");
	}
	else if(z>x&&z>y)
	{
		System.out.println("Third Num is Greatest");
	}
	else
	{
		System.out.println("Number are not distinct");
		
	}

	scan.close();
	}

}
