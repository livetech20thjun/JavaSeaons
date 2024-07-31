package jul31st;

public class Bank {
	
	private double balance=10000;
	
	//getters
	public void getBalance(int pin,int otp)
	{
		//validation 
		if(pin==3214 && otp==654321)
		{
			System.out.println("Balance is "+balance);
		}
		else
		{
			System.out.println("Invalid pin entered ...");
		}
	}
	
	
	//setters
	public void setBalance(double deposit)
	{
		balance=balance+deposit;
	}
	
	

}
