package aug2nd;

public class Clock {
	
	int hr,min,sec;
	
	public Clock()
	{
		hr=10;
		min=10;
		sec=10;
	}
	
	public Clock(int hr)
	{
		this.hr=hr;
	}
	
	public Clock(int hr,int min)
	{
		this.hr=hr;
		this.min=min;
	}
	
	public Clock(int hr,int min,int sec)
	{
		this.hr=hr;
		this.min=min;
		this.sec=sec;
	}
	
	public void getClock()
	{
		System.out.format("%02d:%02d:%02d\n",hr,min,sec);
	}

}
