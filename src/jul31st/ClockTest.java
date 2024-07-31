package jul31st;

public class ClockTest {

	public static void main(String[] args) {
		
		Clock c1=new Clock();
		
		//c1.getClock();
		
		c1.setClock(8, 30, 0);
		c1.getClock();
		
		c1.setClock(9, 0, 0);
		c1.getClock();

	}

}
