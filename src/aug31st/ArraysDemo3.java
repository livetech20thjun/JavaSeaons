// to find smallest number in an array
package aug31st;

public class ArraysDemo3 {

	public static void main(String[] args) {
		
		int[] a= { -10,-7890,12, 46 , 458 ,894,5,4,7852};
		
		
		int smallest=a[0];
		
		for(int i=0;i<a.length;i++)
		{
			
			if(a[i]<smallest)
			{
				smallest=a[i];
			}
		}
		
		System.out.println(smallest);
		

	}

}
