package assignment;

import java.util.*;

public class Parent
{
	int n1,n2;
	int d;
	public Parent()
	{
		System.out.println("Enter two numbers");
		Scanner ip=new Scanner(System.in);
		n1=ip.nextInt();
		n2=ip.nextInt();
	}
public void divisible(int s)
{
	d=s%10;
	if(d==0)
		System.out.println(s+" is divisible by 10");
	else
		System.out.println(s+" is not divisible by 10");
	
}
}