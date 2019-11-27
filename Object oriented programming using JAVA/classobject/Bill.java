package oops;
import java.util.Scanner;
public class Bill {

	public static void main(String[] args)
	{
       Scanner s=new Scanner(System.in);
       Bills b=new Bills();
       TelePhonebill bi=new TelePhonebill();
       System.out.println("enter the Telephone number");
	   int tn=s.nextInt();
	   System.out.println("enter the Customer name");
	    String name=s.next();
	    System.out.println("enter the Number of calls made");
		int nc=s.nextInt();
		System.out.println("enter the cost per call");
		float cost=s.nextFloat();
		System.out.println("enter the Current bill number");
		int cn=s.nextInt();
		System.out.println("enter the Customer name");
		String cus=s.next();
		System.out.println("enter the number of units made");
		int nu=s.nextInt();
		System.out.println("enter the cost per unit");
		float cp=s.nextFloat();
		bi.add(tn,name,nc,cost);
        b.add(cn,cus,nu,cp);

	}

}
class Bills
{

	public void add(int cn,String cus,int nu,float cp) 
	{
		
		System.out.println("Bill number:"+cn);
		System.out.println("Customer name:"+cus);
		System.out.printf("current bill amount:%.1f",(nu*cp));
		
	}
	}
class  TelePhonebill extends Bills
{

	public void add(int tn, String name,int nc,float cost) 
	{
		System.out.println("Bill number:"+tn);
		System.out.println("Customer name:"+name);
		System.out.printf("Telephone bill amount:%.1f\n",(cost*nc));
	}
}