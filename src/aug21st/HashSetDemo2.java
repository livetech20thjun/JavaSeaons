package aug21st;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class HashSetDemo2 {

	public static void main(String[] args) {

		Set<String> hs = new HashSet<String>();

		System.out.println(hs.size()); // 0

		System.out.println(hs.add("Java")); // true
		hs.add("Selenium");
		hs.add("Livetech");
		hs.add("Jmeter");
		hs.add("Python");

		System.out.println(hs.size()); // 5
		
		Iterator<String> it=hs.iterator();
		
		while(it.hasNext())
		{
			String temp=it.next();
			System.out.println(temp);
		}
		
		

	}

}
