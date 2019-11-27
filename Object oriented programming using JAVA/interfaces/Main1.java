package oops;

import java.util.*;
class Main1
{
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    String name=s.next();
    int num=s.nextInt();
    int blnce=s.nextInt();
    int d=s.nextInt();
    int y=s.nextInt();
    int ch=s.nextInt();
    bank ba=new bank();
    switch(ch)
    {
      case 1:
        ba.show();
        break;
      case 2:ba.display();
        break;
    }
  }
}
interface current
{
  public void show();
}
interface savings
{
    public void display();
}
class bank implements current,savings
{
  public void show()
  {
    System.out.println("Name");
    System.out.println("Account Number");
    System.out.println("Account Balance");
    System.out.println("Enter the Start Date(yyyy-mm-dd)");
    System.out.println("Enter the Years");
    System.out.println("Maintainence Charge For Current Account 400.00");
    }
    public void display()
    {
    System.out.println("Name");
    System.out.println("Account Number");
    System.out.println("Account Balance");
    System.out.println("Enter the Start Date(yyyy-mm-dd)");
    System.out.println("Enter the Years");
    System.out.println("Maintainence Charge For Current Account 550.00");
    }
}