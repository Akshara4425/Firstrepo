package assignpoly;
import java.util.*;
public class Purchase 
{
	double price,fp,dis,p;
	String  pname,sesn;
	int qty;
	public void enter()
	{
	Scanner ip=new Scanner(System.in);
	System.out.println("Enter Season ");
	sesn=ip.nextLine();
	System.out.println("Enter the product:  ");	
	pname=ip.nextLine();
	System.out.println("Enter 	quantity: ");
	qty=ip.nextInt();
	System.out.println("Enter Price of one item ");
	price=ip.nextDouble();
	
	
	}
	public void display()
	{
		p=price;
		if(sesn.equalsIgnoreCase("offSeason"))
			{
			Offseason f=new Offseason();
			price=f.discount(price)*qty;
			
			dis=f.di;
			}
		else
		{
			Onseason o=new Onseason();
			price=o.discount(price)*qty;
			dis=o.di;
		}
		System.out.println("product: \t quantity:\t Price item\t discount\t final price\t\n \n");
		System.out.println(pname+"\t\t"+ qty+"\t\t"+ p+"\t\t "+ dis+" \t\t"+ price+"\t\n \n");	
	}

	public static void main(String[] args)
	{
		Purchase obj=new Purchase();
		obj.enter();
		obj.display();
	}
}
