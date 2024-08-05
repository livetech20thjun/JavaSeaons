package aug5th;

public class MethodOverrideDemo1 {

	public static void main(String[] args) {
		
		//case 1
		//P obj1=new P();
		
		//case 2
		//C obj1=new C();
		
		//case 3  -- Invalid case
		//C obj1=new P();
		
		//case 4 
		
		P obj1=new C();
		obj1.m1();
		obj1.greet();
		System.out.println(obj1.x);

	}

}
