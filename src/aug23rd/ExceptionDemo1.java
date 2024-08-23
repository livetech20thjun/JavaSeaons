package aug23rd;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionDemo1 {

	public static void main(String[] args) throws InterruptedException,FileNotFoundException  {
		
		
		System.out.println("Enter Dividend : ");
		
		Scanner input=new Scanner(System.in);
		
		int x=input.nextInt();
		
		System.out.println("Enter Divisor : ");
		
		int y=input.nextInt();
		
		try {
			new FileInputStream("D:\\FLM19thFeb\\RCN Requirment Clarification Notes.xlsx");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Thread.sleep(3000);
		
		try
		{
			//risky code
		System.out.println("Quotient is "+(x/y));
		
		System.out.println("Remainder is "+(x%y));
		}
		catch(ArithmeticException ae)
		{
			System.out.println(ae.getMessage());
			//handling code or user friendly code 
			System.out.println("Please Enter non-zero value for Divisor");
			//e.printStackTrace();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			System.out.println("Other Exception found..");
		}
		
		finally
		{
			System.out.println("File is closed....");
		}
		
		
		System.out.println("End of Program...");
		

	}

}
