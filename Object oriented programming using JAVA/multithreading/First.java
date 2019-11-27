package multithreading;

class C extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			try
			{
				System.out.println("Thread going to sleep "+i+" time");
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
			System.out.println("Thread running "+i+" time");
			System.out.println(i);
			}
	}
}
public class First {

	public static void main(String[] args)
	{
		C c=new C();
		c.start();
	}

}
