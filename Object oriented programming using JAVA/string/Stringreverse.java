package string;
import java.util.Scanner;
public class Stringreverse {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the strings");
		String st=s.nextLine();
		String str[]=st.split(" ");
		int i;
		for(i=0;i<str.length;i++)
		{
			int l=str[i].length();
        	if(i%2!=0)
				{
					for(int j=l-1;j>=0;j--)
					{
						System.out.print(str[i].charAt(j));
					}
					System.out.print(" ");
				}
        	else
        		System.out.print(str[i]+" ");
	  }
		
		
	}

	

}
