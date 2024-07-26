package jul26th;

import java.util.Scanner;

public class MethodsDemo2 {

	public static void main(String[] args) {
		
		MethodsDemo2 obj=new MethodsDemo2();
		obj.natSum();
		obj.natSum();

	}
	
	//methods without return-type and without parameters
	public void natSum()
	{
		System.out.println("Enter some natural number ");
		
		Scanner input=new Scanner(System.in);
		
		int n=input.nextInt();
		
		int res=n*(n+1)/2;
		
		System.out.println("Sum of "+n+" natural numbers is "+res);
		
	}

}
