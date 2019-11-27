package string;
import java.time.*;
public class Datetime {

	public static void main(String[] args)
	{
		System.out.println("Today Date");
		LocalDate date=LocalDate.now();//create a date object
		System.out.println(date);//display the current date
		System.out.println("Current Time");
		LocalTime time=LocalTime.now();//create a time object
		System.out.println(time);//display the current time
		System.out.println("Current Date and Time");
		LocalDateTime dt=LocalDateTime.now();//create a date and time object
		System.out.println(dt);//display the date and time
		

	}

}
