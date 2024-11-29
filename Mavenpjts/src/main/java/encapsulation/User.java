package encapsulation;

public class User {

	public static void main(String[] args)
	{
		
		Bank b=new Bank();
		b.setPid(1234);
		System.out.println("pin is:\t"+b.getPid());
	}

}
