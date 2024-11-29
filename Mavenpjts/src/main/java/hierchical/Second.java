package hierchical;

public class Second extends First 
{
	int b;
	public void printSecond()
	{
		printFirst();
		System.out.println(a+" * "+b+" = "+a*b);
		
	}
	public static void main(String[] arg)
	{
	Second s=new Second();
	//s.printFirst();
	//s.a=6;
	s.b=7;
	
	s.printSecond();
	}

}
