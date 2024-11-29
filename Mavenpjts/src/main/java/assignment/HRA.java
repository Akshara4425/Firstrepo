package assignment;

public class HRA extends Employee 
{
	double hra,pf,ts;
	public void calculate()
	{
		
		hra=ba*(0.05);
		pf=ba*(0.2);
		ts=(bp+hra+ba)-(ded+pf);
	}
	

}
