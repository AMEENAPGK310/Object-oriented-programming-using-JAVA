package oops;
import java.util.Scanner;
public class Encapsulationcase2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Cus c=new Cus();
		System.out.println("enter the number");
		int n=s.nextInt();
		do
		{
		
		System.out.println("enter the name");
		c.setName(s.next());
		System.out.println("enter the address");
		c.setAddress(s.next());
		System.out.println("enter the contact number");
		c.setContact(s.next());
		System.out.println("enter the email");
		c.setMail(s.next());
		System.out.println("enter the proof type");
		c.setProoftype(s.next());
		System.out.println("enter the proofid");
		c.setProofid(s.next());
		if(c.getName()==null)
			System.out.println("invalid name");
		if(c.getAddress()==null)
			System.out.println("invalid address");
		if(c.getContact()==null)
			System.out.println("invalid contact");
		if(c.getMail()==null)
			System.out.println("invalid mail id");
		if(c.getProoftype()==null)
			System.out.println("invalid proof type");
		if(c.getProofid()==null)
			System.out.println("invalid proof id");
		if(c.getName()!=null&&c.getAddress()!=null&&c.getContact()!=null&&c.getMail()!=null&&c.getProoftype()==null&&c.getProofid()==null)
			  System.out.println("Registration successfull");
		if(c.getName()==null||c.getAddress()==null||c.getContact()==null||c.getMail()==null||c.getProoftype()==null||c.getProofid()==null )
			   System.out.println("Registration failed");

		
       }while(c.getName()==null ||c.getAddress()==null||c.getContact()==null||c.getMail()==null||c.getProoftype()==null|| c.getProofid()==null);
		        
		c.register(n,c.getName(),c.getAddress(),c.getContact(),c.getMail(),c.getProoftype(),c.getProofid());
        s.close();

	}

}
