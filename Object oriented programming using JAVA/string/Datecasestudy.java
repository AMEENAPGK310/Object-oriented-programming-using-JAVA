package string;
import java.util.*;
import java.time.*;
import java.time.temporal.ChronoUnit;
public class Datecasestudy {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the name");
		String name=s.next();
		System.out.println("enter the address");
		String address=s.next();
		System.out.println("no of rooms");
		int nr=s.nextInt();
		System.out.println("no of person");
		int ng=s.nextInt();
		System.out.println("AC or non-AC");
		String ac=s.next();
		System.out.println("enter the start sate");
		String sd=s.next();
		LocalDate ds=LocalDate.parse(sd);
		System.out.println("enter the end date");
		String ed=s.next();
	    LocalDate de=LocalDate.parse(ed);
		long nd=ChronoUnit.DAYS.between(ds,de);
		System.out.println("Reg-details:\n");
		System.out.println("Name: "+name);
		System.out.println("Address: "+address);
		System.out.println("No of rooms: "+nr);
		System.out.println("No of guests: "+ng);
		System.out.println("AC: "+ac);
		System.out.println("No of days: "+nd);
		long amount=0;
		int p=ng%2;
		if(p%2!=0)
		{
			if(ac.equals("ac")==true)
			{
				amount=nd*(((ng-p)*1000)+((ng-p)*150)+(p*150)+(p*250));
			}
			else
				amount=nd*(((ng-p)*1000)+(p*250));
		}
		else
		{
			if(ac.equals("ac")==true)
			{
				amount=nd*(((ng-p)*1000)+((ng-p)*150));
			}
			else
				amount=nd*(((ng-p)*1000));
		}
		System.out.println("Total amount: "+amount);
			
		}
	

}