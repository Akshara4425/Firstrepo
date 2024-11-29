package hierchical;

public class Third extends First{

	int c;
	public void printThird()
	{
		printFirst();
		System.out.println(a+" / "+c+" = "+a/c);
		
	}
	public static void main(String[] args)
	{
		Third t=new Third();
		//t.a=6;
		t.c=3;
		t.printThird();
		

	}

}
