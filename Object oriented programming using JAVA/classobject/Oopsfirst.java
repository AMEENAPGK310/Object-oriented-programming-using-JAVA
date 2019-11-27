package oops;
import java.util.Scanner;
public class Oopsfirst {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the name");
		String str=s.next();
		carnew c=new carnew(str);
		carnew.a();
		carnew.b();
		carnew.m();
		s.close();
	}

}
class carnew
{
	String str;
	public carnew(String str)
	{
		str=str;
	}
	public static void m()
	{
		System.out.println("welcome car m");
		System.out.println("welcome car model 12342");
	}
	public static void a()
	{
		System.out.println("welcome car a");
		System.out.println("welcome car model 12765");
	}
	public static void b()
	{
		System.out.println("welcome car b");
		System.out.println("welcome car model 12986");
	}
	public static void  disply(String str)
	{
		System.out.println(str);
	}
	
	
}
