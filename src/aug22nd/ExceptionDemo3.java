package aug22nd;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionDemo3 {

	public static void main(String[] args) throws FileNotFoundException, InterruptedException  {
		
		
		
	 new FileInputStream("D:\\012LivetechWS\\JavaSeasons\\Selenium Running Notes.txt");
	 
	 Thread.sleep(3000);
			
		System.out.println("End of program..");

	}

}
