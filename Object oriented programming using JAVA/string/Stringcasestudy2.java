package string;
import java.util.Scanner;
public class Stringcasestudy2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		StringBuffer sb1=new StringBuffer();
		StringBuffer sb2=new StringBuffer();
		System.out.println("1)car\n2)bike");
		System.out.println("enter the choice");
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
			System.out.println(sb1);
		break;
		case 2:
			System.out.println("enter the details of bike");
			System.out.println("enter the color");
			sb2.append("color:"+s.next()+"\n");
			System.out.println("enter the maximum speed");
			sb2.append("Maximum speed:"+s.next()+"\n");
			System.out.println("enter the number of seats");
			sb2.append("number of seats:"+s.next()+"\n");
			System.out.println("enter the number of wheels");
			sb2.append("number of wheels:"+s.next()+"\n");
			System.out.println("enter the status of disk break(true/false)");
			sb2.append("Disk break:"+s.next()+"\n");
			System.out.println(sb2);
		break;
		default:
			System.out.println("invalid option");
	}
		
		s.close();
		

	}

}
