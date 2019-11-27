package string;
import java.util.Scanner;
public class Stringemployee {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		StringBuffer sb=new StringBuffer();
		System.out.println("Employee Details");
		System.out.println("enter the employee name");
		sb.append(s.next());
		System.out.println("enter the age");
		int age=s.nextInt();
		System.out.println("enter the salary");
		int salary=s.nextInt();
		sb.append("\n"+age);
		sb.append("\n"+salary);
		System.out.println(sb);
		sb.insert(2,"kumar");
		System.out.println(sb);
		sb.deleteCharAt(5);
		System.out.println(sb);

	}

}
