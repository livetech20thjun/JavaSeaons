package aug3rd;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		
		System.out.println("Enter Number ");
		Scanner input3 = new Scanner(System.in);
		int n = input3.nextInt();
		//123
		int res=0;
		
		while(n>0)
		{
			res=res*10+n%10;
			
			n=n/10;
		}
		
		System.out.println(res);
	}
	

}
