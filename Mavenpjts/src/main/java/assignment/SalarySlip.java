package assignment;


public class SalarySlip extends HRA
{

	public void salaryslip()
	{
		
		System.out.println("\t\t\t"+ cmpny+"\n\t\t***********************\n");
		System.out.println("Employee id\t:\t"+Eid);
		System.out.println("Employee Name\t:\t"+nme);
		System.out.println("Occupation\t:\t"+occ);
				
		System.out.println("\nBasic Pay\t:\t"+ba);
		System.out.println("Bonus\t\t:\t"+bp);
		System.out.println("HRA\t\t:\t"+hra);
		System.out.println("Deduction\t:\t"+ded);
		System.out.println("PF\t\t:\t"+pf);
		System.out.println("\nNet Salary\t:\t"+ts);
	}
	public static void main(String[] args) 
	{
		SalarySlip obj=new SalarySlip();
		obj.calculate();
		obj.salaryslip();
		
		
	}

}
