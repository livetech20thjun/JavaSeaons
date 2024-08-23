package aug22nd;

import java.util.Scanner;

public class VotingApp {

	public static void main(String[] args) {
		
		
		System.out.println("Welcome to voting Registration System..");
		
		System.out.println("Enter your age ..");
		
		Scanner input=new Scanner(System.in);
		
		int age=input.nextInt();
		
		if(age <18 )
		{
			//System.out.println("you are not eligible for voting ..");
			try
			{
			throw new AgeLimitException();
			}
			catch(AgeLimitException e)
			{
				//e.printStackTrace();
			System.out.println(e.getMessage());
				
			}
			
		}
		else
		{
			System.out.println("proceed with registration...");
		}

		System.out.println("Thank you for visting..");
	}

}
