package string;
import java.util.Scanner;
public class Stringcasestudy {

	public static void main(String[] args) 
	{
		int a[]=new int[25];
		int i=1;
		String mail,address,name,proof,contact,id="";
		String p="";
		String m="";
		Scanner s=new Scanner(System.in);
		StringBuffer sb=new StringBuffer();
		System.out.println("Registration");
		do
		{
		System.out.println("enter the name");
		name=s.next();
		System.out.println("enter the address");
		address=s.next();
		System.out.println("enter the contact number");
		contact=s.next();
		System.out.println("enter the mail id");
		mail=s.next();
		System.out.println("enter the proof type");
		proof=s.next();
		System.out.println("enter the proof id");
		id=s.next();
		
		System.out.println("Thank you for registering,your id is"+i);
		i++;
		System.out.println("Do you want to continue(y/n)");
		p=s.next();
		}while(p.equals("y"));
		if(p.equals("n"))
		{
		System.out.println("Do you want to update the email(y/n)");
		m=s.next();
		if(m.equals("y"))
		{
			System.out.println("update email");
			System.out.println("enter the new mail id");
			String email=s.next();
			System.out.println("email updated");
			sb.append("name:"+name+"\n"+"address:"+address+"\n"+"contact number:"+contact+"\n"+"mail id:"+email+"\n"+"proof:"+proof+"\n"+"id"+id+"\n");
		}
		else if(m.equals("n"))
			sb.append("name:"+name+"\n"+"address:"+address+"\n"+"contact number:"+contact+"\n"+"mail id:"+mail+"\n"+"proof:"+proof+"\n"+"id"+id+"\n");
			
		}
		System.out.println("Your details are as follows");
		System.out.println(sb);
		s.close();
	}
}
