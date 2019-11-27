package string;
import java.util.Scanner;
public class Prints {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the string");
		String st=s.nextLine();
		int i,count=0,j,k;
		int length=st.length();
		for(i=0;i<length;i++)
		{
			char c=st.charAt(i);
			if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
			{
				count++;
			for(j=0;j<count;j++)
					System.out.println("*");
			System.out.println(c);
			for(k=0;k<count;k++)
				System.out.println("*");
			}
			else
				System.out.print(c);
		}
		s.close();
		}

}
