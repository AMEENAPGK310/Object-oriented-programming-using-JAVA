package oops;
import java.util.Scanner;
public class Overridingcase1 {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		Car cr=new Car();
		Bike bk=new Bike();
		System.out.println("1)Car");
		System.out.println("2)Bike");
		int ch=s.nextInt();
		
		switch(ch)
		{
		case 1:
			System.out.println("enter the details of the car");
			System.out.println("enter the color");
			String ccolor=s.next();
			System.out.println("enter the maximum speed");
			int cspeed=s.nextInt();
			System.out.println("enter the number of seats");
			int cseats=s.nextInt();
			System.out.println("enter the number of wheels");
			int cwheels=s.nextInt();
			System.out.println("enter the number of doors");
			int cdoor=s.nextInt();
			System.out.println("enter the status of AC(true/false)");
			String cac=s.next();
			cr.dispalyDetails(ccolor,cspeed,cseats,cwheels,cdoor,cac);
		break;
		case 2:
	        System.out.println("enter the details of the bike");
	        System.out.println("enter the color");
	 		String bcolor=s.next();
	 		System.out.println("enter the maximum speed");
	 		int bspeed=s.nextInt();
	 		System.out.println("enter the number of seats");
	 		int bseats=s.nextInt();
	 		System.out.println("enter the number of wheels");
	 		int bwheels=s.nextInt();
	 		
	 		System.out.println("enter the status of disbreak(true/false)");
	 		String bac=s.next();
            bk.displayDetails(bcolor,bspeed,bseats,bwheels,bac);
		}
		
		s.close();
	}

}    
class Car
{

	public void dispalyDetails(String ccolor, int cspeed, int cseats, int cwheels, int cdoor, String cac) 
	{
       System.out.println("car details");
       System.out.println("color:"+ccolor);
       System.out.println("maximum speed:"+cspeed);
       System.out.println("number of seats:"+cseats);
       System.out.println("number of wheels:"+cwheels);
       System.out.println("number of doors:"+cdoor);
       System.out.println("AC"+cac);
		
	}
    
}
class Bike extends Car
{

	public void displayDetails(String bcolor, int bspeed, int bseats, int bwheels, String bac)
	{
		System.out.println("bike details");
	       System.out.println("color:"+bcolor);
	       System.out.println("maximum speed:"+bspeed);
	       System.out.println("number of seats:"+bseats);
	       System.out.println("number of wheels:"+bwheels);
	       System.out.println("AC:"+bac);
		
		
			}
}