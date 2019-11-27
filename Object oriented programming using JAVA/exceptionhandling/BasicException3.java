package exceptionhandling;

public class BasicException3 {

	public static void main(String[] args) 
	{
	   try {
		   String s="abc";
		   int a=Integer.parseInt(s);
		   System.out.println(a);
	   }
	    catch(NumberFormatException e)
	   {
	    	System.out.println(e);
	   }
	}

}
