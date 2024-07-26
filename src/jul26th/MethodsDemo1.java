package jul26th;

public class MethodsDemo1 {

	public static void main(String[] args) {
		
		MethodsDemo1 obj1=new MethodsDemo1();
		
		obj1.natSum(10);
		obj1.natSum(100);
		obj1.natSum(1000);

	}
	
	public void natSum(int n)
	{
		int res=n*(n+1)/2;
		
		System.out.println("Sum of "+n+" natural numbers is "+res);
	}

}
