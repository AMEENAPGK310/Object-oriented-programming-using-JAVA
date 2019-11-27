package SingleInheritance;
import java.util.Scanner;
public class Singlecase1 {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Number of persons");
		int p=s.nextInt();
		System.out.println("Total number of days");
		int t=s.nextInt();
		System.out.println("Tarrif per day");
		double ta=s.nextDouble();
		System.out.println("Room type");
		String r=s.next();
		SeasonBooking sb=new SeasonBooking();
	    sb.book(p,t,r,ta);
	    sb.total(p,t,ta);
		

	}

}
class Abc
{
	public void book(int p,int t,String r,double ta)
	{
		System.out.println("Booking");
		System.out.printf("enter the number of persons:%d\n",p);
		System.out.printf("enter the number of days:%d\n",t);
		System.out.printf("enter the roomtype:%s\n",r);
		System.out.printf("enter the tarrif for single person:%f\n",ta);

		
	}
 

	}
class SeasonBooking extends Abc
{

	
	public void total(int p,int t,double ta) 
	{
		int y=(int) (p*t*ta);
		System.out.printf("Total tarrif:%d",y);
				
	}
	
	}
