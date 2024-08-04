package aug3rd;

import java.util.Scanner;

public class IfElseDemo4 {

	public static void main(String[] args) {

		System.out.println("Enter your Dept : ");
		Scanner input1=new Scanner(System.in);
		String dept=input1.next();
		
		System.out.println("Enter your Salary ");
		Scanner input=new Scanner(System.in);
		double sal=input.nextDouble();
		
		if(dept.equals("IT"))
		{
			if(sal<=20000)
			{
				System.out.println("Net Salary "+(sal+sal*0.3));
			}
			else if(sal>20000 && sal<=30000)
			{
				System.out.println("Net Salary "+(sal+sal*0.4));
			}
			else 
			{
				System.out.println("Net Salary "+(sal+sal*0.5));
			}
		}
		else if(dept.equals("NON-IT"))
		{
			if(sal<=20000)
			{
				System.out.println("Net Salary "+(sal+sal*0.2));
			}
			else if(sal>20000 && sal<=30000)
			{
				System.out.println("Net Salary "+(sal+sal*0.3));
			}
			else 
			{
				System.out.println("Net Salary "+(sal+sal*0.4));
			}
		}
		

	}

}
