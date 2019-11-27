package string;
import java.util.Scanner;
public class String2 {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		String str="qwertyuiop asdfghjkl; zxcvbnm,./";
		char ch[]=str.toCharArray();
		System.out.println("enter the character");
		char c=s.next().charAt(0);
		System.out.println("enter the string");
		String sr=s.next();
		char[] cs=sr.toCharArray();
		System.out.println("original message:");
		for(int i=0;i<sr.length();i++)
		{
			for(int j=1;j<str.length();j++)
			{
				if(cs[i]==ch[j]&&c=='R')
					System.out.print(ch[j-1]);
                if(cs[i]==ch[j]&&c=='L')
					System.out.print(ch[j+1]);
			}
		}
	}
}