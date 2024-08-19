package aug6th;

public class MyTest {

	public static void main(String[] args) {
		
		//Cannot instantiate the type MyInter
		// new MyInter();
		
		MyInter obj1=new MyClass();
		
		obj1.display(10);
		
		//The static field MyInter.PI should be accessed in a static way
		//System.out.println(obj1.PI);
		
		System.out.println(MyInter.PI);

	}

}
