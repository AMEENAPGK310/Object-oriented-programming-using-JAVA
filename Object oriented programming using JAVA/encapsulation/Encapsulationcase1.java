package oops;
import java.util.Scanner;
public class Encapsulationcase1 {

	public static void main(String[] args)
			{
				Scanner s=new Scanner(System.in);
				customers cs=new customers();
				display d=new display();
				System.out.println("enter the name");
				cs.setName(s.next());
				System.out.println("enter the address");
				cs.setAddress(s.next());
				System.out.println("enter the contact");
				cs.setContact(s.next());
				System.out.println("enter the mailid");
				cs.setMailid(s.next());
				System.out.println("enter the proof type");
				cs.setProoftype(s.next());
				System.out.println("enter the proof id");
				cs.setProofid(s.next());
				//cs.reg(cs.getName(),cs.getAddress(),cs.getContact(),cs.getMailid(),cs.getProoftype(),cs.getProofid());
				d.displays(cs.getName(),cs.getAddress(),cs.getContact(),cs.getMailid(),cs.getProoftype(),cs.getProofid());
				s.close();
			}
}
class customers
{
	String name;
	String address;
	String contact;
	String mailid;
	String prooftype;
	String proofid;
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getContact() {
		return contact;
	}


	public void setContact(String contact) {
		this.contact = contact;
	}


	public String getMailid() {
		return mailid;
	}


	public void setMailid(String mailid) {
		this.mailid = mailid;
	}


	public String getProoftype() {
		return prooftype;
	}


	public void setProoftype(String prooftype) {
		this.prooftype = prooftype;
	}


	public String getProofid() {
		return proofid;
	}


	public void setProofid(String proofid) {
		this.proofid = proofid;
	}


//	public void reg(String name,String address,String contact,String mailid,String prooftype,String proofid)
//	{
//		System.out.println("Registration");
//		System.out.println(name);
//		System.out.println(address);
//		System.out.println(contact);
//		System.out.println(mailid);
//		System.out.println(prooftype);
//		System.out.println(proofid);
//		System.out.println("Thank you for registering,your id is.."+i);
//		
//	}
	
	}
class display
{

	public void displays(String name, String address, String contact, String mailid, String prooftype, String proofid) {
		{
			int cus[]=new int[25];
			int i=1;

		    System.out.println("Registration");
			System.out.println(name);
			System.out.println(address);
			System.out.println(contact);
			System.out.println(mailid);
			System.out.println(prooftype);
			System.out.println(proofid);
			System.out.println("Thank you for registering,your id is.."+i);
			i++;
			
		}
		
	}
	}