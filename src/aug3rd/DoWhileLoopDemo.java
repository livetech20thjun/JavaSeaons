package aug3rd;

import java.util.Scanner;

public class DoWhileLoopDemo {

	public static void main(String[] args) {
		
		System.out.println("Welcome to game zone ");
		
		int option;
		do
		{
			System.out.println("Choose options");
			System.out.println("1. Wish to play");
			System.out.println("2. just looking for options");
			System.out.println("3. Exit");
			System.out.println("Enter your Option ");
			Scanner input3=new Scanner(System.in);
			 option=input3.nextInt();
			 if(option == 3)
			 {
				 System.out.println("Thank you for visting ..");
				 break;
			 }
			
		}
		while(option==1);

	}

}
