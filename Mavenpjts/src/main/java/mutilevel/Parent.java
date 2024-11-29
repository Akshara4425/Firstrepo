package mutilevel;

public class Parent extends GrantParent
{
	int b,s;
public void disp()
{
	b=7;
	System.out.print("------->Parent\t");
	s=a+b;
	System.out.println("sum"+s);
	
}
	public static void main(String[] args) 
	{
		Parent p=new Parent();
		p.display();
		p.disp();// TODO Auto-generated method stub

	}

}
