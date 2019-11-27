package string;
import java.util.Scanner;
public class Stringvowelscheck {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the string");
		String st=s.nextLine();
		int i,c=0,p=0,n=0,cn=0,sp=0,up=0,lw=0;
		char ch;
		for(i=0;i<st.length();i++)
		{
			ch=st.charAt(i);
			if(ch>='A'&&ch<='Z')
				up++;
			if(ch>='a'&&ch<='z')
				lw++;
			if(ch=='A'||ch=='a'||ch=='E'||ch=='e'||ch=='O'||ch=='o'||ch=='I'||ch=='i'||ch=='U'||ch=='u')
			{
				c++;
				
			}
			
			else if(ch=='@'||ch=='$'||ch=='&'||ch=='%')
			{
			p++;
			}
			else if(ch>='1'&&ch<='9')
				n++;
			else if(ch==' ')
				sp++;
			else
				cn++;
				
	}
		System.out.println("vowels:"+c);
		System.out.println("Special charcters:"+p);
		System.out.println("numbers:"+n);
		System.out.println("consonants:"+cn);
		System.out.println("space:"+sp);
		System.out.println("uppercase:"+up);
		System.out.println("lowercase:"+lw);
	}
		

}
