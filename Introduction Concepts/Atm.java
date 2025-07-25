import java.util.*;
public class Atm
{


  public static void main(String[] args) 
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int fivehund=n/500;
     n%=500;
     int twohund=n/200;
     n%=200;
     int onehund=n/100;
     
     System.out.println("500 notes are:"+fivehund);
     System.out.println("200 notes are:" +twohund);
     System.out.println("200 notes are:" +onehund);
  }

}