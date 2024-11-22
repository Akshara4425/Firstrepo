package Super;

public class ParentSuper  {
	String s;
	public ParentSuper()
	{
		s="In Parent";
		System.out.println("default parameterized constructor");
	}
	ParentSuper(String s1,String s2)
	{
		
		System.out.println(" parameterized constructor");
	}
	public void display()
	{
		System.out.println(s);
	}
	public void ParentSuper() {
		// TODO Auto-generated method stub
		
	}

}
