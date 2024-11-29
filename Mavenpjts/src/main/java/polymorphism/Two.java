package polymorphism;

public class Two extends One 
{
	int a,d;
	public void display(int s,int g) 
	{
		super.display(s,g);
		a=s;
		d=g;
		
		System.out.println("Two Class"+(a+d));
	}

	

	public static void main(String[] args) {
		Two ob=new Two();
		ob.display(4,5);

	}

}
