package string;
import java.io.*;

import java.util.Scanner;
public class Longestword {

	public static void main(String[] args) throws IOException 
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the string");
		String s=br.readLine().trim()+"";
		String word="";
		String longword="";
		int i;
		for(i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c==' ')
			{
				if(longword.length()<word.length())
					longword=word;
				word=" ";
			}
			else
				word=word+c;
		}
		int l=longword.length();
		System.out.println(longword);
		System.out.println(l);

	}

}
