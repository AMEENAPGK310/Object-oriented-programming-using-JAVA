package regularexpression;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegCasestudy {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Pattern fnm=Pattern.compile("(^[A-Z]+[a-z]*)");//first name
		Pattern lnm=Pattern.compile("[A-Z]+([ '-][a-zA-Z]+)*");//last name
		Pattern em=Pattern.compile("^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+(?:\\.[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$");//mail id
		Pattern re =Pattern.compile("^[0-9]*");//reg no
		Pattern ra=Pattern.compile("^[0-9]*");//rank
		Pattern ye=Pattern.compile("^[0-9]*");//year
		Pattern de=Pattern.compile("^[A-Za-z]+.*");
		Pattern pwd=Pattern.compile("((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,15})");
		System.out.println("Enter the first name");
		String fname=s.next();
		Matcher f=fnm.matcher(fname);
		System.out.println("Enter the last name");
		String lname=s.next();
		Matcher l=lnm.matcher(lname);
		System.out.println("Enter the email id");
		String mail=s.next();
		Matcher e=em.matcher(mail);
		System.out.println("Enter the register number");
		String reg=s.next();
		Matcher r=re.matcher(reg);
		System.out.println("Enter the rank");
		String rank=s.next();
		Matcher ran=ra.matcher(rank);
		System.out.println("Enter the year");
		String year=s.next();
		Matcher y=ye.matcher(year);
		System.out.println("Enter the department");
		String dept=s.next();
		Matcher d=de.matcher(dept);
		if(f.matches()&&l.matches()&&r.matches()&&e.matches()&&ran.matches()&&y.matches())
		{
			System.out.println("enter the user name");
			String uname=s.next();
			Matcher u=em.matcher(uname);
			System.out.println("enter the password");
			String pswd=s.next();
			Matcher ps=pwd.matcher(pswd);
			if(u.matches())
				System.out.println("valid mail id");
			else
				System.out.println("invalid mail id");
			if(ps.matches())
				System.out.println("valid password");
			else
				System.out.println("invalid password");
			
		}
		if(f.matches()&&l.matches())
			System.out.printf("name:%s %s\n",fname,lname);
		else
			System.out.println("invalid name");
		if(e.matches())
			System.out.println("email id:"+mail);
		else
			System.out.println("invalid email id");
		if(r.matches())
			System.out.println("Register number:"+reg);
		else
			System.out.println("invalid register number");
		if(ran.matches())
			 System.out.println("rank:"+rank);
		else
			System.out.println("invalid rank");
		if(y.matches())
			System.out.println("year:"+year);
		else
			System.out.println("invalid year");
		if(d.matches())
			System.out.println("department:"+dept);
		else
			System.out.println("invalid department");
	     
	     
	     
	    
	     
	     
	     
	     
	     
	     
	     
		
		
			
			
		

	}

}
