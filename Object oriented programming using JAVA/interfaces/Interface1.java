package oops;
import java.util.Scanner;
public class Interface1 {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the name");
		String name=s.next();
		System.out.println("enter the id");
		int id=s.nextInt();
		System.out.println("enter the marks of 5 subjects");
		int  m1=s.nextInt();
		int  m2=s.nextInt();
		int  m3=s.nextInt();
		int  m4=s.nextInt();
		int  m5=s.nextInt();
		int total=m1+m2+m3+m4+m5;
		int avr=0;
		objects obj=new objects();
         obj.detail(name,id);
         obj.show(total,avr);
         s.close();
         }
}
interface ranked
{
	public void detail(String name,int id); 
	}
interface total
{
	public void show(int total,int avr);
	}
class objects implements ranked,total
{

	public void detail(String name,int id) 
	{
		System.out.println("name:"+name);
		System.out.println("ID:"+id);

		
	}

	public void show(int total,int avr)
	{
		avr=total/5;
		System.out.println("total:"+total);
		if(total>=450)
			System.out.println("rank 1");
		if(total>=400 && total<450)
			System.out.println("rank 2");
		if(total>=350 && total<400)
			System.out.println("rank 3");
		if(total>=300 && total<350)
			System.out.println("rank 2");

        if(total<300)
        	System.out.println("fail");

		
	}
	}
