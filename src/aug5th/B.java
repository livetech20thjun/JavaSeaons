package aug5th;

public class B extends A {
	
	int x;
	
	public void putX(int x)
	{
		this.x=x;
	}

	public void greet()
	{
		System.out.println("good afternoon...");
	}
	
	public void display()
	{
		System.out.println(super.x);
		super.greet();
	}
}
