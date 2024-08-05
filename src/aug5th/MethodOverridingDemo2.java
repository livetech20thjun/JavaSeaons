package aug5th;

public class MethodOverridingDemo2 {

	public static void main(String[] args) {
		
		
		//case 1
		
		//A obj1=new A();
		
		//case 2
		
		B obj1=new B();
		
		//case 3 - not useful
		
		//A obj1=new B();
		
		obj1.setX(10);
		obj1.putX(20);
		System.out.println(obj1.x);
		//obj1.greet();
		obj1.display();
		
		

	}

}
