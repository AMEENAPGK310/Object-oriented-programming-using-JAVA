package exceptionhandling;

public class Exceptionthrow {

	public static void main(String[] args)
	{
		int a=1;
		int b=12;
		if(a>b)
			throw new ArithmeticException("b is greater");
		else
			System.out.println("a is greater");

	}

}
