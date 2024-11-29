package product;

public class LineItem 
{
int qty;
Product p;
	public LineItem(int qty,Product p)
	{
	//super();
	this.qty = qty;
	this.p=p;
	}
	public void display() {

		System.out.println("Product ID\t:"+p.pid);
		System.out.println("Product Name \t:"+p.Pnme);
		System.out.println("Description\t:"+p.Pdes);
		System.out.println("Quantity \t:"+qty);
	}

	public static void main(String[] args)
	{
		Product p=new Product(123,"Lexi Pen","Ball point  Blue colour pen");
		LineItem l=new LineItem(50,p);
		l.display();
	}

}
