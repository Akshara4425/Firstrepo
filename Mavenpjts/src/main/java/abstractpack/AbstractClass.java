package abstractpack;

public class AbstractClass extends Classabstract 
{

	@Override
	public void display()
	{
		// TODO Auto-generated method stub
		System.out.println("outside abstract class abstract method implement");
	}
	public void display1()
	{
		// TODO Auto-generated method stub
		System.out.println("child class  method implement\n");
	}
	public static void main(String[] args)
	{
		AbstractClass ab=new AbstractClass();
		ab.display();
		ab.read();
		ab.display1();
		Classabstract obj=new AbstractClass();
		obj.display();
		obj.read();
		// obj.display1(); cant called bcz it is a reference of parentclass,it cant access child method
	}

}
