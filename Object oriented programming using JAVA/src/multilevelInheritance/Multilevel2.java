package multilevelInheritance;
import java.util.Scanner;
public class Multilevel2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int d=s.nextInt();
		int c=s.nextInt();
		mobile m=new mobile();
        m.model();
        m.colour();
        m.memory(d);
        m.cost(c);
        
	}
}

class Computer
{
	public void model() {
		System.out.println("dell");
		
	}

}
class laptop extends Computer
{
	public void colour() {
		System.out.println("white");
		
	}

	}
class mobile extends laptop
{

	public void memory(int d)
	{
		
		System.out.println("memory:"+d);
		
		
	}

	public void cost(int c) {
		System.out.println("cost:"+c);
				
	}

	
		}
