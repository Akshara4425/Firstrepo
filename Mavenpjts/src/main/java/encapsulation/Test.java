package encapsulation;

public class Test {

	public static void main(String[] args) 
	{
		Student s=new Student();
		s.setSid(1);
		s.setSnme("Anu");
		//String n=s.getSnme();
		System.out.println("Id\t"+s.getSid());
		System.out.println("Name\t"+s.getSnme());
		// TODO Auto-generated method stub

	}

}
