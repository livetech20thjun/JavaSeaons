package aug22nd;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionDemo2 {

	public static void main(String[] args)  {
		
		
		try {
			new FileInputStream("D:\\012LivetechWS\\JavaSeasons\\Selenium Running Notes.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			System.out.println("Make sure file is present..");
		}
		
		System.out.println("End of program..");

	}

}
