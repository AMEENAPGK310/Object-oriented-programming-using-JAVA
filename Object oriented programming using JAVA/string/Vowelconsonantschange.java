package string;
import java.util.Arrays;
import java.util.Scanner;
public class Vowelconsonantschange {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		String a=s.next();
		String b=s.next();
		String c=s.next();
		char[] ch=a.toCharArray();
		char cj[]=b.toCharArray();
        int n=ch.length;
        int l=cj.length;
		int i;
		for(i=0;i<n;i++)
		{
			if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
				ch[i]='$';
			System.out.print(ch[i]);
			
		}
		for(i=0;i<l;i++)
		{
			if(cj[i]!='a'&&cj[i]!='e'&&cj[i]!='i'&&cj[i]!='o'&&cj[i]!='u')
				cj[i]='#';
			System.out.print(cj[i]);
		}
		String st=c.toUpperCase();
		
		
		System.out.print(st);
	}

}
