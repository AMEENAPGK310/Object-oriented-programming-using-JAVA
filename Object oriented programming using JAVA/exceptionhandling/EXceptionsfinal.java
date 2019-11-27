package exceptionhandling;

public class EXceptionsfinal {

	public static void main(String[] args)
	{
		try 
		{
			int a[]= {1,2,3,4};
			a[7]=20/2;
			System.out.println(a[7]);
			String s=null;
			System.out.println(s.length());
			String st="abc";
			int b=Integer.parseInt(st);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("program completed");
		}

	}

}
