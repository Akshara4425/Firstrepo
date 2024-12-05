package ExceptionHandle;
import java.util.*;
public class ThrowClass {
	public void vote(int age)
	{
		if(age>18)
			System.out.println("Eligable for vote");
		else
			throw new ArithmeticException("not eligable for vote");
	}

	public static void main(String[] args) 
	{
		System.out.println("Enter age");
		
		Scanner s =new Scanner(System.in);
		int age=s.nextInt();
		ThrowClass t=new ThrowClass();
		t.vote(age);

		
		// TODO Auto-generated method stub

	}

}
