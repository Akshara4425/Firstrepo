package Super;

public class Childsuper extends ParentSuper 
{
String b;
Childsuper()
{
	
	//super();
	
	b="in child";
}
Childsuper(String s1,String s2)
{
	
	s=s1;
	b=s2;
	//b="in child";
}
public void disp()
{
	super.display();
	//super.s="to Child";
	//System.out.println(super.s);
System.out.println(b);	
}

	public static void main(String[] args) {
		Childsuper c=new Childsuper();
		c.disp();
		Childsuper c1=new Childsuper("here "," am");
		c1.disp();
		//super.s="hai";
		//System.out.println(super.s);	System.out.println(c.s);
		//System.out.println(c.b);
		
		
		
		
		// TODO Auto-generated method stub

	}

}
