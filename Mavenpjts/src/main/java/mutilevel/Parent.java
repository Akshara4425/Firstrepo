package mutilevel;

public class Parent extends GrantParent
{
public void disp()
{
	System.out.print("------->Parent\t");
}
	public static void main(String[] args) 
	{
		Parent p=new Parent();
		p.display();
		p.disp();// TODO Auto-generated method stub

	}

}
