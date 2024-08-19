package aug19th;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		
		List<Integer> al=new ArrayList<Integer>();
		
		System.out.println(al.size());
		
		al.add(10);
		
		//al.add(20.33);
		
		al.add(20);
		
		al.add(30);
		
		al.add(40);
		
		al.add(50);
		
	
		//al.add("Livetech");
		
		System.out.println(al.size());
		
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		
		

	}

}
