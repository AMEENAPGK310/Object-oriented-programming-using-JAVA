package multithreading;

public class Secondyield {

	public static void main(String[] args) 
	{
		Car1 t1=new Car1();
		Car2 t2=new Car2();
		Car3 t3=new Car3();
		t1.start();
		t2.start();
		t3.start();
	}

}
class Car1
{

	public void start() 
	{
		for(int i=0;i<=5;i++)
		{
			if(i==1)yield();
			     System.out.println("Car A running"+i);
			}
		System.out.println("Car A running complete");
		}

	private void yield() {
		// TODO Auto-generated method stub
		
	}
		
	}

class Car2
{

	public void start() 
	{
		for(int i=0;i<=5;i++)
		{
			if(i==2)stop();
			    System.out.println("Car B running"+i);
		}
		System.out.println("Car A running Completed");
		
	}

	private void stop() {
		// TODO Auto-generated method stub
		
	}
	}
class Car3
{

	public void start() {
		// TODO Auto-generated method stub
		
	}
	}