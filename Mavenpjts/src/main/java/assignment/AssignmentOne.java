package assignment;
import java.util.*;

public class AssignmentOne extends Parent 
{
	int s;

	public AssignmentOne()
	{
	super();
	s=0;
	}
	public void sum()
	{
		s=n1+n2;
		System.out.println(n1+" + "+n2+" = "+s);
		super.divisible(s);
		
	}
	public static void main(String[] args) {
		AssignmentOne obj=new AssignmentOne();
		obj.sum();

	}

}
