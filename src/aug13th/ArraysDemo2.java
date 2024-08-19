package aug13th;

import aug2nd.Student;

public class ArraysDemo2 {

	public static void main(String[] args) {
		
		Student[] a=new Student[10];
			
		
		System.out.println(a.length);
		
		a[0]=new Student();
		a[0].rollNo=1;
		a[0].sNa="John";
		
		a[1]=new Student();
		a[1].rollNo=2;
		a[1].sNa="Sam";
		
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=null)
			{
			System.out.println(a[i].rollNo);
			System.out.println(a[i].sNa);
			}
		}
		
	

	}

}
