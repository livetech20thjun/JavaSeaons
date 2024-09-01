package aug31st;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicatesInArray {

	
	public static void main(String[] args) {
		
		int[] a= {1,2,4,5,9,10,1,1,1,1,13,15,10,4,1,2,1};
		
		Set<Integer> hs=new HashSet<Integer>();
		List<Integer> al=new ArrayList<Integer>();
		
		for(int i=0;i<a.length;i++)
		{
			if(hs.add(a[i])==false)
			{
				if(!al.contains(a[i]))
				{
				al.add(a[i]);
				}
			}
			
		}
		
		System.out.println(al);
	}
}
