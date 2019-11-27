package string;
import java.util.Scanner;
public class Stringfunctions {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		String a="now is";//read first string
		String b="the time";//read second string
		String c="the";//read third string
		String d="AMEENA";//read forth string
		System.out.println("length:"+a.length());//print the length of the string
		System.out.println("character:"+a.charAt(4));//print the character at position 4
		System.out.println("substring:"+a.substring(2,5));//print the string from 2 to 5
		System.out.println("value:"+b.startsWith("the"));//print whether the string is starting from 'the' or not
		System.out.println("index:"+a.indexOf("is"));//print the index
		System.out.println("concatenation:"+a.concat(c));//concatenate strings
		System.out.println("replaced string:"+b.replace("t" ,"T"));//replace from one character to other
		System.out.println("equal value:"+b.equals(c));//check whether the two strings are equal or not
		String str[]=a.split(" ");
		System.out.println("split strings:");//split the string 
        for(int i=0;i<str.length;i++)
		{
				System.out.println(str[i]);
		}
        System.out.println("uppercase:"+a.toUpperCase());//change to uppercase
        System.out.println("lowercase:"+d.toLowerCase());//change to lowercase
        System.out.println("value:"+d.endsWith("the"));
		   
	}
}