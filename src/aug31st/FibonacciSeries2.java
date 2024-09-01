package aug31st;

public class FibonacciSeries2 {

	public static void main(String[] args) {
		
		int n=10;
		
		int n1=0;
		 int n2=1;
		 
		// System.out.print(n1+"\t");
		// System.out.print(n2+"\t");
		 
		 for(int i=1;i<=n;i++)
		 {

			 int res=n1+n2;
			 
			 if(res%2==0)
			 {
			 System.out.print(res+"\t");
			 }
			 
			 n1=n2;
			 n2=res;
			 
		 }

	}

}
