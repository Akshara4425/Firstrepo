package ExceptionHandle;

public class ExceptioEg {

	public static void main(String[] args)
	{
		int a=5,b=0;
		System.out.println(a +" "+ b);
		try
		{
		a=a/b;
		System.out.println(a);
		}
		
		catch(ArithmeticException e)
		{
			b=1;
			System.out.println(e);
			a=a/b;
			System.out.println(a);
		}
		finally
		{
			System.out.println("Exception found");
		}
		}
		

	}


