package jul26th;

public class MethodsDemo3 {

	public static void main(String[] args) {
		
		MethodsDemo3 obj=new MethodsDemo3();
		
		 //int r=obj.natSum(10);
		 //System.out.println(r);
		System.out.println(obj.natSum(10));
		System.out.println(obj.natSum(100));
		System.out.println(obj.natSum(1000));
		
		

	}
	
	//methods with return-type and with parameters
	public int natSum(int n)
	{
		int res=n*(n+1)/2;
		
		return res;
		
	}

}
