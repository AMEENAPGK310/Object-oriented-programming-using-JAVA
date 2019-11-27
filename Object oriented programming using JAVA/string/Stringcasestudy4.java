package string;
import java.util.Scanner;
public class Stringcasestudy4 {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the pasha's string");
		String str=s.next();
		System.out.println("enter the number of days");
		int n=s.nextInt();
		System.out.println("enter the position from which pasha started transforming");
		int pos=s.nextInt();
		int l=str.length();
		String b="";
		for(int i=l-2;i>=n;i--)
		{
			b=b+str.charAt(i);
		}
		String a="a";
		String f="f";
        System.out.println("The resultant string");
        System.out.println(a+b+f);
	}

}
