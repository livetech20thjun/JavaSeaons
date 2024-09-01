// to finf largest number in an array
package aug31st;

public class ArraysDemo2 {

	public static void main(String[] args) {
		
		int[] a= { -10,-7890,12, 46 , 458 ,894,5,4,7852};
		
		int largest=a[0];
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>largest)
			{
				largest=a[i];
			}
		}
		
		System.out.println(largest);
		

	}

}
