package aug31st;

public class FibonacciSeries1 {

	public static void main(String[] args) {
		
		int n=20;
		
		int n1=0;
		 int n2=1;
		 
		// System.out.print(n1+"\t");
		// System.out.print(n2+"\t");
		 
		 for(int i=1;i<=n;i++)
		 {

			 int res=n1+n2;
			 
			 System.out.print(res+"\t");
			 
			 n1=n2;
			 n2=res;
			 
		 }

	}

}
