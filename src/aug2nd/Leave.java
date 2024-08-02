package aug2nd;

public class Leave extends Marks {

	int sl,cl;
	
	public void setLeaves(int cl,int sl)
	{
		this.cl=cl;
		this.sl=sl;
	}
	
	public void getLeaves()
	{
		System.out.println("Total Leaves Taken "+(sl+cl));
	}
}
