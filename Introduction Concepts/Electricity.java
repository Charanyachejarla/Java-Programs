import java.util.*;
public class Electricity {
    public static void main(String args[])
    {
    Scanner sc =new Scanner(System.in);
    String Customername=sc.next();
    System.out.println("Customer name:"+Customername);
    int CustomerID=sc.nextInt();
    System.out.println("Customer ID:"+CustomerID);
    int units=sc.nextInt();
    System.out.println("units Consumed:"+ units);
    double basebill=0;
    if(units<=0)
    {
        System.out.println("inavild");
    }
    if(units<=100)
    {
        basebill=units*1.50;
        System.out.println("basebill:"+basebill);
    }
    else if(units<=200)
    {
        basebill=100*1.50+(units-100)*2.00;
        System.out.println("basebill:"+basebill);
    }
    else if(units<=300)
    {
        basebill=100*1.50+100*2.00+(units-200)*3.00;
        System.out.println("basebill:"+basebill);
    }
    else{
        basebill=100*1.50+100*2.00+100*3.00+(units-300)*5.00;
        System.out.println("basebill:"+basebill);
    }
    double gst=0.05*basebill;
    System.out.println("GST:"+gst);
    double servicecharge=25.0;
    System.out.println("Service charge:"+servicecharge);
   
    if(basebill>=500)
    {
        double discount=basebill*0.05;
        System.out.println("Discount:"+discount);
        basebill-=discount;
    }
    double bill=basebill+gst+servicecharge;
    System.out.println("total bill:"+bill);


    }
}
