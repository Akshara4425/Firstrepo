package inhertpjt;

public class Child extends Parent {
	public  void disp()
	{
		System.out.println("in B");
		System.out.println("value a: "+a);
	}

	public static void main(String[] args) {
		Child  c=new Child();
		c.a=7;
		c.display();
		c.disp();
		// TODO Auto-generated method stub
		

	}

}
