package oops;
import java.util.*;
public class Overriding2 {

	public static void main(String[] args)
	{
		one de=new one();
		de.show();
	}
}
class Dm
{
	public void show() {
		System.out.println("parent class");
		
	}
	}
class one extends Dm
{

	public void show()
	{
		super.show();
		System.out.println("child class");
	}
}