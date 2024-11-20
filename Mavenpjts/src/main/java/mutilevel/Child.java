package mutilevel;

public class Child extends Parent
{
	public void dis()
	{
		System.out.print("------->Child\n");
	}
	public static void main(String[] args) 
	{
		Child c=new Child();
		c.display();
		c.disp();
		c.dis();// TODO Auto-generated method stub

	}

}
