package string;
import java.util.Arrays;
import java.util.Scanner;
public class Stringassessment {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the string");
		String st=s.nextLine();
		String a=st.toUpperCase();
		char b[]=a.toCharArray();
		Arrays.sort(b);
		int f[]=new int[b.length];
		int i;
		for(i=0;i<b.length;i++)
		{
		    f[i]=1;
		    for(int j=i+1;j<b.length;j++)
		    {
		    	if(b[i]==b[j])
		    	{
		    		f[i]++;
		    		b[j]='0';
		    	}
		    }
		
		}
		for(i=0;i<f.length;i++)
		{
			if(b[i]!=' '&&b[i]!='0')
				System.out.println(b[i]+"-"+f[i]);
		}
		

	}

}
