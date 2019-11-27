package multilevelInheritance;
import java.util.Scanner;
public class Multilevel {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Audi a=new Audi();
		a.model();
		a.colour();
		a.name();

	}

}
class car5
{
	public void model() {
		System.out.println("2015");
		
	}

}
class suzuki extends car5
{
	public void colour() {
		System.out.println("blue");
		
	}
	}
class Audi extends suzuki
{

	public void name() {
		System.out.println("audi");
		
	}

	

		}