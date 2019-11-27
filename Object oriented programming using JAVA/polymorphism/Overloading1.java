package oops;
import java.util.Scanner;
public class Overloading1 {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		s.close();
		Add ad=new Add();
		ad.show(a);
		ad.show(a,b);
		ad.show(a,b,c);
		


	}

}
class Add
{

	public void show(int a) {
		System.out.println("first number:"+a);
		
	} 
public void show(int a, int b, int c) {
	
	System.out.printf("sum:%d",a+b+c);
		
	}
public void show(int a, int b) {
	System.out.printf("diff:%d",a-b);
		
	}

	
}
