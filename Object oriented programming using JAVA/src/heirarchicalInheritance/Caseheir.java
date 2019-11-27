package heirarchicalInheritance;
import java.util.*;
	class Caseheir
	{
	  public static void main(String args[])
	  {
	    Scanner s=new Scanner(System.in);
	    String bname=s.next();
	    String bcolor=s.next();
	    float bcc=s.nextFloat();
	    int bspeed=s.nextInt();
	    double bprice=s.nextDouble();
	    int bdis=s.nextInt();
	    String sname=s.next();
	    String scolor=s.next();
	    float scc=s.nextFloat();
	    int sspeed=s.nextInt();
	    double sprice=s.nextDouble();
	    int sdis=s.nextInt();
	    int sweight=s.nextInt();
	    single1 s1=new single1();
	    single2 s2=new single2();
	    s1.show();
	    s2.display();
	    s1.shows(bname,bcolor,bcc,bspeed,bprice,bdis);
	    s2.displays(sname,scolor,scc,sspeed,sprice,sweight,sdis);
	   }
	}
	class parent
	{
	  public void show()
	  {
	    System.out.println("Enter the details of Sports Bike");
	    System.out.println("Name of the bike :");
	    System.out.println("Color of the bike :");
	    System.out.println("Capacity(cc) of the bike :");
	    System.out.println("Speed of the bike :");
	    System.out.println("Price of the bike :");
	    System.out.println("Discount of the bike :");
	  }
	  public void display()
	  {
	    System.out.println("Enter the details of Scooter");
	    System.out.println("Name of the Scooter :");
	    System.out.println("Color of the Scooter :");
	    System.out.println("Capacity(cc) of the Scooter :");
	    System.out.println("Speed of the Scooter :");
	    System.out.println("Price of the Scooter :");
	    System.out.println("Discount of the Scooter :");
	    System.out.println("Weight of the Scooter :");
	  }
	}
	class single1 extends parent
	{
	   public void shows(String bname,String bcolor,float bcc,int bspeed,double bprice,int bdis)
	   {
	           System.out.println("Sports Bike :");
	           System.out.println("Name : "+bname);
	           System.out.println("Color : "+bcolor);
	           System.out.println("Capacity : "+bcc);
	           System.out.println("Speed : "+bspeed);
	           System.out.println("Price : "+bprice);
	           System.out.println("Manufacturer Discount : "+bdis);
	           double total=bprice-bdis;
	           System.out.printf("Sports Bike price is %.1f\n",total);
	   }
	}
	class single2 extends parent
	{
	   public void displays(String sname,String scolor,float scc,int sspeed,double sprice,int sweight,int sdis)
	   {
	      System.out.println("Scooter :");
	      System.out.println("Name : "+sname);
	      System.out.println("Color : "+scolor);
	      System.out.println("Capacity : "+scc);
	      System.out.println("Speed : "+sspeed);
	      System.out.println("Price : "+sprice);
	      System.out.println("Weight : "+sweight);
	      System.out.println("Manufacturer Discount : "+sdis);
	      double tot=sprice-sdis;
	      System.out.printf("Scooter price is %.1f",tot);
	   
	   }
	}
