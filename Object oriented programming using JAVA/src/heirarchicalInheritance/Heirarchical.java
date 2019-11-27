package heirarchicalInheritance;
import java.util.Scanner;
public class Heirarchical {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int d=s.nextInt();
		B b=new B();
		b.add(a,d);
		b.div(a,d);
		C c=new C();
		c.mul(a,d);
		c.mod(a,d);
		s.close();

	}

}
class A
{
	public void add(int a,int d)
	{
		System.out.printf("sum:%d\n",a+d);
		
	}
	public void mul(int a, int d)
	{
		System.out.printf("prdct:%d\n",a*d);

		
	}

}
class B extends A
{
	public void div(int a, int d) {
		System.out.printf("quo:%d\n",a/d);

		
	}

		
}
class C extends A
{

	public void mod(int a, int d)
	{
		System.out.printf("mod:%d\n",a%d);
		
	}

	
	
}
