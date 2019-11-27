package oops;
public class Overriding1 {

	public static void main(String[] args)
	{
		Abc ab=new Abc();
		ab.show();
		Demo d=new Demo();
		d.show();
		
		
			
	}

}
class Abc
{
	public void show()
	{
		System.out.println("parent class");
	}
}
class Demo extends Abc
{

	public void show() 
	{
		System.out.println("child class");

		
	}
	
}