package aug3rd;

import java.util.Scanner;

public class IfElseDemo3 {

	public static void main(String[] args) {
		
		//double sal=10000;
		
		System.out.println("Enter your Salary ");
		Scanner input=new Scanner(System.in);
		double sal=input.nextDouble();
		
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
