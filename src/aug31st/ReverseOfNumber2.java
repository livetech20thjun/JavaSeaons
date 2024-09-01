package aug31st;

public class ReverseOfNumber2 {

	public static void main(String[] args) {
		
		int n=1203;
		
		int res=0;
		
		while(n!=0)
		{
			
			res=res*10+(n%10);
			
			n=n/10;
		}
		
		System.out.println(res);

	}

}
