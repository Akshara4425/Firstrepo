package aggregation;

public class Second
{
int eid;
String Enme;
First Address;
public Second(int eid ,String Enme,First Address)
{
	this.eid=eid;
	this.Enme=Enme;
	this.Address=Address;//Address is  an obj
	
}
public void display() {

	System.out.println("ID\t "+eid);
	System.out.println("Name \t"+Enme);
	System.out.println("Adderss\t "+ Address.hnme+"\t,"+Address.city+"\t, "+Address.state+"\t, "+Address.pin);
}

	public static void main(String[] args) 
	{
		First f=new First("Athira H","TDPA","IDUKKI",685583);
		Second obj=new Second(3245,"anu",f);
		obj.display();
		// TODO Auto-generated method stub

	}

}
