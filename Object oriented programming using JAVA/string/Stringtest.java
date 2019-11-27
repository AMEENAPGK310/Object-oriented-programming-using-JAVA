package string;
import java.util.Scanner;
public class Stringtest {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the first string");
		String str1=s.nextLine();
		System.out.println("enter the second string");
		String str2=s.nextLine();
		str1=str1.trim();
		str2=str1.trim();
		str1=str1.toUpperCase();
		str2=str2.toUpperCase();
		String a[]=str1.split(" ");
		String b[]=str2.split(" ");
		str1="";
		str2="";
		for(int i=0;i<a.length;i++)
		{
			str1=str1+a[i];
		}
		for(int i=0;i<b.length;i++)
		{
			str2=str2+b[i];
		}
		int l=str1.length()+str2.length();
		boolean check[] = new boolean[str2.length()];
		for(int i=0;i<str2.length();i++)
			check[i]=false;
		for(int i=0;i<str1.length();i++)
		{
			for(int j=0;j<str2.length();j++)
			{
				if((check[j]==false) && (str1.charAt(i) == str2.charAt(j)))
				{
					check[j]=true;
					l=l-2;
					break;
				}
			}
		}
		boolean[] fcheck=new boolean[6];
		for(int i=0;i<6;i++)
			fcheck[i]=true;
		int co=6;
		int k=1,dl=0,j;
		for(j=0;j<co;j++)
		{
			if(k<=l)
			{
				if(j==co)
					j=0;
				if(fcheck[j]==true)
					k=k+1;
			}
			if(k-1==l)
			{
				dl=dl+1;
				fcheck[j]=false;
				k=1;
			}
			if(dl==6)
			{
				if(j==0)
					System.out.println("friends");
				else if(j==1)
					System.out.println("lovers");
				else if(j==2)
					System.out.println("affection");
				else if(j==3)
					System.out.println("married");
				else if(j==4)
					System.out.println("enemies");
				else if(j==5)
					System.out.println("sibilings");
				
			}
		}
     }

}