package oops;
import java.util.Scanner;
public class Abstractstudent {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the name");
		String name=s.next();
		System.out.println("enter the id");
		int id=s.nextInt();
		System.out.println("enter the marks of 5 subjects");
		int m1=s.nextInt();
		int m2=s.nextInt();
		int m3=s.nextInt();
		int m4=s.nextInt();
		int m5=s.nextInt();
		int total=m1+m2+m3+m4+m5;
		int avg=0;
		college st=new college();
		st.display(name,id,total,avg);
		}
}
abstract class teacher
{
	abstract void display(String name, int id, int total, int avg);

	public void show(int total)
	{
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
class college extends teacher
{
	public void display(String name, int id, int total, int avg)
	{
		System.out.println("Name:"+name);
		System.out.println("ID:"+id);
		avg=total/5;
		System.out.println("Average:"+avg);
		super.show(total);

	}
	
	
}