package aug23rd;

import java.util.Scanner;

public class VoterRegistration {
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to Voting Registration System..");
		System.out.println("Enter below Details : ");
		System.out.println("Enter your Age : ");
		Scanner input=new Scanner(System.in);
		int age=input.nextInt();
		
		if(age>=18)
		{
			System.out.println("Please proceed to  voter registration ..");
		}
		else
		{
			//System.out.println("Not eligible for voting ..");
			
			try
			{
			throw new InvalidAgeException();
			}
			catch(InvalidAgeException e)
			{
				System.out.println(e.getMessage());
			}
		}
		
		System.out.println("End of Registration...");
		
	}

}
