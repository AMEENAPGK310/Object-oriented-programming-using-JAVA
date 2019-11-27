package string;
import java.util.*;
public class Currentcalendar {

	public static void main(String[] args)
	{
		Calendar cal=Calendar.getInstance();
		System.out.println("At present calendar's year: "+cal.get(Calendar.YEAR));
		System.out.println("At present calendar's day: "+cal.get(Calendar.DATE));
		System.out.println("The current date is: "+cal.getTime());
		cal.add(Calendar.DATE,-7);
		System.out.println("7 days ago: "+cal.getTime());
		cal.add(Calendar.MONTH,10);
		System.out.println("10 months later: "+cal.getTime());
		cal.add(Calendar.YEAR,10);
		System.out.println("10 years later: "+cal.getTime());
		
		
		
	}

}
