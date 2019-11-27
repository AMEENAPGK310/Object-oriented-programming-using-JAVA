package exceptionhandling;
import java.util.Scanner;
public class BasicException1 {

	public static void main(String[] args)
	{
	  try {
		  int a=30/0;
	  }
	  catch(ArithmeticException e)
	  {
		  System.out.println(e);
	  }

	}

}
