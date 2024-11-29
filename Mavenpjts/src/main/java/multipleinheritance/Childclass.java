package multipleinheritance;

public class Childclass implements Interface1,Interface2

{

	public static void main(String[] args) {
	Childclass c=new Childclass();
	c.display();
	c.show();
	Interface1 o=new Childclass();
	o.display();

	}

	@Override
	public void show() {
		System.out.println("2nd interface");
		
	}

	@Override
	public void display() {
		System.out.println("1st interface");
		
		
	}

}
