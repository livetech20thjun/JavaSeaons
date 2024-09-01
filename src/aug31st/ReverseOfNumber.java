package aug31st;

public class ReverseOfNumber {

	public static void main(String[] args) {
		
		int n=230;
		
		while(n!=0)
		{
			System.out.print(n%10);
			n=n/10;
		}

	}

}
