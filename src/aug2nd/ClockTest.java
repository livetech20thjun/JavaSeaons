package aug2nd;

public class ClockTest {

	public static void main(String[] args) {

		//user 1
		new Clock().getClock();
		
		
		//user 2
		new Clock(8).getClock();
		
		//user 3
		new Clock(8,6).getClock();
		
		//user 4
		new Clock(8,6,55).getClock();
		
	}

}
