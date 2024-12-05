package ExceptionHandle;
import java.util.*;
public class Customexception
{

	public void vote(int age) throws NotEligable
	{
		if(age>18)
			System.out.println("Eligable for vote");
		else
			throw new NotEligable("not eligable for vote");
	}

	public static void main(String[] args) throws NotEligable 
	{
		System.out.println("Enter age");
		
		Scanner s =new Scanner(System.in);
		int age=s.nextInt();
		Customexception t=new Customexception();
		t.vote(age);

		
		// TODO Auto-generated method stub

	}

}
