package string;
import java.util.Scanner;
public class Stringvowel {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		while(true)
		{
	    String str=s.nextLine();
	    if(str.equals(".")||str.equals("?")||str.equals("!"))
	    	break;
	    str=str.toUpperCase();
	    int x=0;
	    for(int i=0;i<str.length();i++)
	    {
	    	char c=str.charAt(i);
	    	switch(c)
	    	{
	    	case 'A':
	    	case 'E':
	    	case 'I':
	    	case 'O':
	    	case 'U':x++;
	    	break;
	    	}
	    }
	    System.out.println(str+"-"+x);
	    
		}
	    
	}

}
