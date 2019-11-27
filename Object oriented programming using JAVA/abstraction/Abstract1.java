package oops;
import java.util.Scanner;
public class Abstract1 {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		rank r=new rank();
		r.mark();
     }
}
abstract class Students
{
	abstract void mark();

	public void reg()
	{
	
		System.out.println("rank 1");
	}
		
}
class rank extends Students
{
   public void mark() 
	 {
	   super.reg();
	   System.out.println("total mark:450");
       
	 }
	}