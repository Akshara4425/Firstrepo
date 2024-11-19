
package palindrom;
import java.util.*;
public class PalindromOrNot
{
	int t,n;
    public  PalindromOrNot()
    {
    	  Scanner s = new Scanner(System.in);
          System.out.println("Enter the number");
          n=s.nextInt();
          s.close();
    }
    public void reverse()
    {
        int x=n,j=0;
        while(x!=0)
        {
            j=x%10;
            x=x/10;
            t=(t*10)+j;
            
        }  
    } 
    public void palindrome()
    {
        if(n==t)
        System.out.println(n+" is palindrom");
        else
        System.out.println(n+" is not palindrom"); 
    } 
    public static void main(String args[])
    {
    	 PalindromOrNot obj1=new PalindromOrNot();
        obj1.reverse();
        obj1.palindrome();


    }


}
