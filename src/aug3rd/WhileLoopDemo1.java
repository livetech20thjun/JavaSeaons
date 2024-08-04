package aug3rd;

import java.util.Scanner;

public class WhileLoopDemo1 {

	public static void main(String[] args) {
		
		
		System.out.println("Welcome to game ..");
		
		while(true)
		{
			System.out.println("Enter a char ");
			Scanner input=new Scanner(System.in);
			char ch=input.next().charAt(0);
			
			if(ch=='x' || ch=='X')
			{
				System.out.println("Game over ..exiting ..");
				break;
			}
			else
			{
				System.out.println("you have entered "+ch+" character");
				System.out.println("Continue the game ..");
			}
			
		}

	}

}
