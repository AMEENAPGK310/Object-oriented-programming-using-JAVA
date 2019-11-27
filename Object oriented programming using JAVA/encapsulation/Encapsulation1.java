package oops;

import java.util.Scanner;

public class Encapsulation1 {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		Student st=new Student();
		System.out.println("enter the name");
		st.setName(s.next());
		System.out.println("enter the id");
		st.setId(s.nextInt());
		System.out.println("name:"+st.getName());
		System.out.println("id:"+st.getId());
		
		

	}

}
