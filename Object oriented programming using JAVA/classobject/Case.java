package oops;

import java.util.Scanner;

public class Case {
	
	  public static void main(String args[])
	  {
	    Scanner s=new Scanner(System.in);
	    System.out.println("Enter the number");
	    String number=s.next();
	    System.out.println("Enter the name");
	    String name=s.next();
	    System.out.println("Enter the address");
	    String address=s.next();
	    System.out.println("Enter the contact number");
	    String contact=s.next();
	    System.out.println("Enter the email");
	    String email=s.next();
	    System.out.println("Enter the proofType");
	    String proof=s.next();
	    System.out.println("Enter the proof ID");
	    String id=s.next();
	    System.out.println("Registration Successfull");
	    Customer c=new Customer();
	    c.register(number,name,address,contact,email,proof,id);
	  }
	}
	class Customer
	{
	  void register( String number,String name,String address,String contact,String email,String proof,String id)
	  {
	    System.out.print("Your Details:");
	    System.out.println(name);
	    System.out.println(address);
	    System.out.println(contact);
	    System.out.println(email);
	    System.out.println(proof);
	    System.out.println(id);
	    System.out.printf("Your id is"+number);
	  }
}
