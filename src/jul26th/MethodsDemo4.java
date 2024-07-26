package jul26th;

import java.util.Scanner;

public class MethodsDemo4 {

	public static void main(String[] args) {
		
		
		MethodsDemo4 obj=new MethodsDemo4();
		
		System.out.println(obj.natSum());
		System.out.println(obj.natSum());
		System.out.println(obj.natSum());
		

	}
	
	
	//methods with return-type and without parameters

	public int natSum()
	{
		System.out.println("Enter some natural number ");
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int res=n*(n+1)/2;
		return res;
		
	}

}
