package aug21st;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetDemo1 {

	public static void main(String[] args) {
		
		Set<String> hs=new HashSet<String>();
		//List<String> hs=new ArrayList<String>();
		
		System.out.println(hs.size());  //0
		
	System.out.println(hs.add("Java")); //true
		hs.add("Selenium");
		hs.add("Livetech");
		hs.add("Jmeter");
		hs.add("Python");
				
		System.out.println(hs.size());  //5
		
		System.out.println(hs.add("Java"));//false
		hs.add("Selenium");
		hs.add("Livetech");
		hs.add("Jmeter");
		hs.add("Python");
		
		System.out.println(hs.size()); //5
		 
		System.out.println(hs);
		
		for(String temp:hs)
		{
			System.out.println(temp);
		}
		
		

	}

}
