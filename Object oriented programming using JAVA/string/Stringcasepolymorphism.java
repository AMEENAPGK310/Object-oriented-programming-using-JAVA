package string;
import java.util.Scanner;
public class Stringcasepolymorphism {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		StringBuffer sb1=new StringBuffer();
		Car cr=new Car();
		Bike bk=new Bike();
		System.out.println("1)Car");
		System.out.println("2)Bike");
		int ch=s.nextInt();
		switch(ch)
		{
		case 1:
			System.out.println("enter the details of car");
			System.out.println("enter the color");
			sb1.append("color:"+s.next()+"\n");
			System.out.println("enter the maximum speed");
			sb1.append("Maximum speed:"+s.next()+"\n");
			System.out.println("enter the number of seats");
			sb1.append("number of seats:"+s.next()+"\n");
			System.out.println("enter the number of wheels");
			sb1.append("number of wheels:"+s.next()+"\n");
			System.out.println("enter the number of doors");
			sb1.append("number of doors:"+s.next()+"\n");
			System.out.println("enter the status of AC(true/false)");
			sb1.append("Ac:"+s.next()+"\n");
			cr.display(sb1);
					break;
		case 2:
			System.out.println("enter the details of bike");
			System.out.println("enter the color");
			sb1.append("color:"+s.next()+"\n");
			System.out.println("enter the maximum speed");
			sb1.append("Maximum speed:"+s.next()+"\n");
			System.out.println("enter the number of seats");
			sb1.append("number of seats:"+s.next()+"\n");
			System.out.println("enter the number of wheels");
			sb1.append("number of wheels:"+s.next()+"\n");
			System.out.println("enter the status of disk break(true/false)");
			sb1.append("Disk break:"+s.next()+"\n");
			bk.display(sb1);
		break;
		default:
			System.out.println("invalid option");
	}
	}	
}
class Car
{

	public void display(StringBuffer sb1) 
	{
		System.out.println("car details");
		System.out.println(sb1);
		
	}
	
}
class Bike extends Car
{
	public void display(StringBuffer sb1)
	{
		System.out.println("car details");
		System.out.println(sb1);
		
	}
}