package aug5th;

public class AbstarctDemo1 {

	public static void main(String[] args) {
		
		//new Numbers();
		//Cannot instantiate the type Numbers
		
		Numbers obj=new Sum();
		
		obj.compute(10, 20);
		obj.greet();

	}

}
