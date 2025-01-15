package multi;

public class ClassA  implements B ,C
{
	

	public static void main(String[] args)
	{
		ClassA obj=new ClassA();
		
		B obj1=new ClassA();
		C obj2=new ClassA();
		obj2.display();
		obj1.show();
		obj.prints();

	}

	public void prints()
	{
		System.out.println("Child showing");
	}
	public void display()
	{
		System.out.println("implementing interface C");
	}
	@Override
	public void show() 
	{
		System.out.println("implementing intterface");
		
	}

}
