package mutilevel;

public class Child extends Parent
{
	int c,sum;
	public void dis()
	{
		c=12;
		sum=a+b+c;
		s=s*c;
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
