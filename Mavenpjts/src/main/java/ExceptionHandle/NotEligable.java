package ExceptionHandle;

public class NotEligable extends Exception {
	public NotEligable()
	{
		System.out.println("not Eliglible");
	}

	public NotEligable(String string) {
		super(string);
		System.out.println(string);// TODO Auto-generated constructor stub
	}

}
