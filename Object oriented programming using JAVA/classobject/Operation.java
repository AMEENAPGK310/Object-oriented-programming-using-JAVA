package oops;
import java.util.Scanner;
public class Operation {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the first number");
		int a=s.nextInt();
		System.out.println("enter the second number");
		int b=s.nextInt();
		System.out.println("enter the opertion");
		int n=s.nextInt();
		Operation1 operate=new Operation1();
		switch(n)
		{
		case 1:
			operate.add(a,b);
			break;
		case 2:
			operate.sub(a,b);;
			break;
		case 3:
			operate.mul(a,b);
			break;
		case 4:
			operate.div(a,b);
			break;
		case 5:
			operate.mod(a,b);
			break;
		}
		s.close();
	}

}
class Operation1
{
	
	public static void operate(int n1,int n2)
	{
	 int a=n1;
     int b=n2;
	}
	public static void add(int a,int b)
	{
		System.out.printf("sum:%d",a+b);
	}
	public static void sub(int a,int b)
	{
		System.out.printf("diff:%d",a-b);
	}
	public static void mul(int a,int b)
	{
		System.out.printf("pro:%d",a*b);
	}
	public static void div(int a,int b)
	{
		System.out.printf("quo:%d",a/b);
	}
	public static void mod(int a,int b)
	{
		System.out.printf("mod:%d",a%b);
	}
}
