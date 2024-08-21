package aug21st;

import java.util.Scanner;

public class ExceptionDemo1 {

	public static void main(String[] args) {
		
		System.out.println("Enter some value for x : ");
		Scanner input1=new Scanner(System.in);
		int x=input1.nextInt();
		
		System.out.println("Enter some value for y : ");
		Scanner input2=new Scanner(System.in);
		int y=input2.nextInt();
		
		try
		{
		int z=x/y;
		
		System.out.println("Quotient is : " + z);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Please Enter non-zero value for y");
		}
		
		System.out.println("End of Program..");

	}

}
