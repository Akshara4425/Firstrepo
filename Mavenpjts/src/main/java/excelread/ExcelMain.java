package excelread;

import java.io.IOException;

public class ExcelMain 
{

	public static void main(String[] args) throws IOException 
	{
		
		System.out.print("\n"+ ExcelRead1.getStringdata(1,0));	// TODO Auto-generated method stub

		System.out.print("\t"+ExcelRead1.getIntegerdata(1, 1));
		
		System.out.print("\t"+ExcelRead1.getStringdata(1, 2));
		
		System.out.print("\n"+ ExcelRead1.getStringdata(2,0));	// TODO Auto-generated method stub

		System.out.print("\t"+ExcelRead1.getIntegerdata(2, 1));
		
		System.out.print("\t"+ExcelRead1.getStringdata(2, 2));
		
		System.out.print("\n"+  ExcelRead1.getStringdata(3,0));	// TODO Auto-generated method stub

		System.out.print("\t"+ExcelRead1.getIntegerdata(3, 1));
		
		System.out.print("\t"+ExcelRead1.getStringdata(3, 2));
		
	}

}
