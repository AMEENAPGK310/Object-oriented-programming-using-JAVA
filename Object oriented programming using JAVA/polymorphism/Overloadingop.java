package oops;
import java.util.Scanner;
public class Overloadingop {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		Opera op=new Opera();
		System.out.println("enter the first number");
		int a=s.nextInt();
		System.out.println("enter the second number");
		int b=s.nextInt();
		System.out.println("enter the third number");
		int c=s.nextInt();
		System.out.println("enter the fourth number");
		int d=s.nextInt();
		System.out.println("enter the fifth number");
		int e=s.nextInt();
		op.oper(a);
		op.oper(a,b);
		op.oper(a,b,c);
		op.oper(a,b,c,d);
		op.oper(a,b,c,d,e);
		
		

	}

}
class Opera
{

	public void oper(int a, int b) {
		// TODO Auto-generated method stub
		
	}

	public void oper(int a, int b, int c, int d)
	{
	    System.out.printf("product:%d",a*b*c*d);
		
	}

	public void oper(int a, int b, int c, int d, int e) 
	{
		System.out.printf("result:%d",(a+b)*c*(d-e));
		
	}

	public void oper(int a, int b, int c) 
	{
		System.out.printf("sum:%d",a+b+c);
		
	}

	public void oper(int a)
	{
		System.out.println("sqrt"+a*a);
		
		
	}
}