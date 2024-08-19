package aug19th;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo3 {

	public static void main(String[] args) {
		
		List<String> al=new ArrayList<String>();
		
		System.out.println(al.size());
		
		al.add("Java");
		
		al.add("Selenium");
		
		al.add("Livetech");
		
		al.add("Python");
		
		al.add("Appium");
		
	
		
		
		System.out.println(al.size());
		
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		
		

	}

}
