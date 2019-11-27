package SingleInheritance;
import java.util.Scanner;
public class Single2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		dept d=new dept();
		d.departments();
		d.subjects();
		s.close();

	}

}
class college
{
	public void departments()
	{
	
	   System.out.println("departments are:\n");
	   System.out.println("1.cse\n2.ece\n3.me\n4.ce");
	
		
	}
}
class dept extends college
{

	public void subjects()
	{
		System.out.println("subjects are:\n");
		System.out.println("1.english\n2.maths\n3.data structure\n4.electronics");

		
	}
}