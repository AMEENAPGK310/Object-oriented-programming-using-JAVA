package oops;
import java.util.Scanner;
public class Overloadingstudent {

	public static void main(String[] args)

	{
	Scanner s=new Scanner(System.in);
	System.out.println("enter the name");
	String name=s.next();
	System.out.println("enter the rollno");
	int rollno=s.nextInt();
	System.out.println("enter the department");
	String dep=s.next();
	System.out.println("enter the year");
	int year=s.nextInt();
	System.out.println("enter the marks of 5 subjects");
	int m1=s.nextInt();
	int m2=s.nextInt();
	int m3=s.nextInt();
	int m4=s.nextInt();
	int m5=s.nextInt();
	int avg=0;
	int total=m1+m2+m3+m4+m5;
	s.close();
	Stud st=new Stud();
	st.show(name,rollno,dep,year);
	st.show(total,avg);
	st.show(total);

	}

}
class Stud
{

	public void show(String name, int rollno, String dep, int year)
	{
		System.out.println("Name of the student:"+name);
		System.out.println("Rollno:"+rollno);
		System.out.println("Department:"+dep);
		System.out.println("Year:"+year);
		
	}

	public void show(int total)
	{
		if(total>=450)
		{
			System.out.println("rank is 1");
		}
		if(total>=400 && total<=450)
		{
			System.out.println("rank is 2");
		}
		if(total>=350 && total<=300)
		{
			System.out.println("rank is 3");
		}
		if(total>=300 && total<=250)
		{
			System.out.println("rank is 4");
		}
		if (total<250)
		    System.out.println("fail");
	}

	public void show(int total,int avg)
	{ 
		
		avg=total/5;
		System.out.println("average:"+avg);
				
	}

		
}