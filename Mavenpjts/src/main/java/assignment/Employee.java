package assignment;
import java.util.*;
public class Employee
{
	String cmpny,nme,occ;
	int Eid;
	double ba,ded,bp;
	public Employee()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Company Name:");
		cmpny=s.nextLine();
		System.out.println("Enter Employee Name:");
		nme=s.nextLine();
		System.out.println("Enter Occupation:");
		occ=s.nextLine();
		System.out.println("Enter Employee id:");
		Eid=s.nextInt();
		System.out.println("Enter Basic Pay:");
		ba=s.nextDouble();
		System.out.println("Enter Deduction:");
		ded=s.nextDouble();
		System.out.println("Enter bonus:");
		bp=s.nextDouble();
		}

}
