package aug22nd;

public class AgeLimitException extends RuntimeException {

	
	public AgeLimitException()
	{
		super("Your age is less than 18");
	}
}
