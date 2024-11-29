package acessspecifier;

public class Access2  extends Access1
{
	
	public void pubmthd()
	{
	System.out.println("Public");
	}
	protected void promthd()
	{
		System.out.println("Protected");
	}
	private void primthd()
	{
		System.out.println("Private");
	}
	 void defmthd()
	{
		System.out.println("default");
	}
	public static void main(String[] args)
	{
		Access2 obj=new Access2();
		obj.add();//public method call
		obj.div();//default method call
		obj.mult();//protected can access through inheritance
		//obj.sub();//private can't access to another class
		// TODO Auto-generated method stub

	}

}
