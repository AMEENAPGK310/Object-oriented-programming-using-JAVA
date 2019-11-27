package multithreading;
import java.util.Scanner;
public class Welcome {

	public static void main(String[] args)
	{
		A a=new A();
		a.start();
	    }
}
class A extends Thread
{
	public void run()
	{   
		Scanner s=new Scanner(System.in);
		System.out.println("enter the string");
		String st=s.next();
		int n=st.length();
		int i;
		for(i=0;i<n;i++)
		{
			char ch[]=st.toCharArray();
			try
			{
				System.out.println(ch[i]);
				Thread.sleep(15000);
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
		}
	}
}