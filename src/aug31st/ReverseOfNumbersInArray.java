package aug31st;

public class ReverseOfNumbersInArray {

	public static void main(String[] args) {
		
		int[] a= {102,304,456,780,321};
		
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+"\t");
		}
		
		for(int i=0;i<a.length;i++)
		{
			int n=a[i];
			
			a[i]=reverseOfNumber(n);
		}
		
		System.out.println();
		
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+"\t");
		}
	}

	private static int reverseOfNumber(int n) {
		
			int res=0;
		
		while(n!=0)
		{
			
			res=res*10+(n%10);
			
			n=n/10;
		}
		
		return res;
		
	}
}
