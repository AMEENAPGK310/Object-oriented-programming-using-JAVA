package string;
import java.util.Arrays;
import java.util.Scanner;
public class Stringquestion2 {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the guest's name");
		String str=s.next();
		System.out.println("Enter the name of the residence host");
		String str1=s.next();
		System.out.println("Enter the letters in a pile");
		String str2=s.next();
		char k[]=str2.toCharArray();
		String st=str1+str2;
		int y=st.length();
		int x=str2.length();
		char p[]=st.toCharArray();
		Arrays.sort(p);
		Arrays.sort(k);
		String m=Arrays.toString(p);
		String n=Arrays.toString(k);
		String e=new String(m);
		String r=new String(n);
		if(e.equals(r)&&x==y)
			System.out.println("yes");
		else
		System.out.println("no");
	}
		
}