package acessspecifier;

public class Access1 {
	int a,b,c,d;
	public void add()
	{
	System.out.println("Public");
	}
	protected void mult()
	{
		System.out.println("Protected");
	}
	private void sub()
	{
		System.out.println("Private");
	}
	 void div()
	{
		System.out.println("default");
	}

	public static void main(String[] args)
	 {
		Access1 obj=new Access1();
		obj.add();//public method call
		obj.div();//default method call
		obj.mult();//protected
		obj.sub();//private
	}

}
