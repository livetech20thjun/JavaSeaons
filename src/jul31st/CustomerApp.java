package jul31st;

public class CustomerApp {

	public static void main(String[] args) {
		
		Bank c1=new Bank();
		
		//The field Bank.balance is not visible
		//System.out.println(c1.balance);

		c1.getBalance(3214,654321);
		
		c1.setBalance(1000);
		
		c1.getBalance(3214,654321);
		
	}

}
