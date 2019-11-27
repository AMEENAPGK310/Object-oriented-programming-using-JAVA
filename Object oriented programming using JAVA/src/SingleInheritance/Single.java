package SingleInheritance;
import java.util.Scanner;
public class Single 
{ 
	
   public static void main(String[] args)
   {
	   
	   Scanner s=new Scanner(System.in);
	   System.out.println("enter the speed");
	   int a=s.nextInt();
	   toyota c=new toyota();
	   c.about();
	   c.speed(a);
	   c.name();
	   s.close();
	   
		

	}

}
class car
{

	public void about() 
	{
		System.out.println("2020 model");
				
	}

	
}
class toyota extends car
{
	public void speed(int a)
	{
		System.out.println("speed="+a);
		
		
	}

	public void name()
	{
		System.out.println("Toyota");
		
	}
}