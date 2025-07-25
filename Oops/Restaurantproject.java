class Fooditem{
    String itemId;
    String itemName;
    double unitPrice;
    int quantity;
    Fooditem(String itemId,String itemName,double unitPrice,int quantity)
    {
        this.itemId=itemId;
        this.itemName=itemName;
        this.unitPrice=unitPrice;
        this.quantity=quantity;
    }
    double calculateBill(){
        double subtotal=unitPrice*quantity;
        double GST=0.05*subtotal;
        double totalbill=GST+subtotal;
        if(totalbill>1000)
        {
            totalbill-=0.10*totalbill;
            
        }
       return totalbill;
    }
    void display()
    {
        System.out.println("Food Item Record");
        System.out.println("ID :"+itemId );
        System.out.println("Name :"+itemName);
        System.out.println("unitprice:"+unitPrice);
        System.out.println("quantity:"+quantity);
    }

} 
class DineIn extends Fooditem{
    double serviceCharge;
    double subtotal;
    double GST;
    double Discount;
    double totalbill;
    DineIn(String itemId, String itemName, double unitPrice,int quantity,double serviceCharge){
        super(itemId, itemName, unitPrice, quantity);
        this.serviceCharge=serviceCharge;
    }
    double calculateBill(){
        subtotal=unitPrice*quantity;
        double totalbeforetax=subtotal+serviceCharge;
        GST=0.05*totalbeforetax;
        totalbill=GST+totalbeforetax;
        Discount=0;
        if(totalbill>1000)
        {
            Discount=0.10*totalbill;
            totalbill-=Discount; 
        }
       return totalbill;
    }
    void display()
    {
         System.out.println("Food Item Record");
        System.out.println("ID :"+itemId );
        System.out.println("Name :"+itemName);
        System.out.println("unitprice:"+unitPrice);
        System.out.println("quantity:"+quantity);
        System.out.println("Service Charge:"+serviceCharge);
        System.out.println("Subtotal:"+subtotal) ;
        System.out.println("GST:"+GST);
        System.out.println("Discount:"+Discount);
        System.out.println("Total Bill:"+totalbill);
    }     
 }
 class Takeaway extends Fooditem
 {
    double packingCharge;
    double subtotal;
    double GST;
    double Discount;
    double totalbill;
    Takeaway(String itemId, String itemName, double unitPrice,int quantity,double packingCharge ){
        super(itemId, itemName, unitPrice, quantity);
        this.packingCharge=packingCharge;
    }
    double calculateBill(){
        subtotal=unitPrice*quantity;
        double totalbeforetax=subtotal+packingCharge;
        GST=0.05*totalbeforetax;
        totalbill=GST+totalbeforetax;
        Discount=0;
        if(totalbill>1000)
        {
            Discount=0.10*totalbill;
            totalbill-=Discount;
        }
        return totalbill;
    }
     void display()
    {
         System.out.println("Food Item Record");
        System.out.println("ID :"+itemId );
        System.out.println("Name :"+itemName);
        System.out.println("unitprice:"+unitPrice);
        System.out.println("quantity:"+quantity);
        System.out.println("Service Charge:"+packingCharge);
        System.out.println("Subtotal:"+subtotal) ;
        System.out.println("GST:"+GST);
        System.out.println("Discount:"+Discount);
        System.out.println("Total Bill:"+totalbill);
    }}
 
class Delivery extends Fooditem
{
    double deliveryFee;
    double subtotal;
    double GST;
    double Discount;
    double totalbill;
    Delivery(String itemId, String itemName, double unitPrice,int quantity,double deliveryFee){
        super(itemId, itemName, unitPrice, quantity);
        this.deliveryFee=deliveryFee;
    }
    double calculateBill(){
        subtotal=unitPrice*quantity;
        double totalbeforetax=subtotal+deliveryFee;
        GST=0.05*totalbeforetax;
        totalbill=GST+totalbeforetax;
        Discount=0;
        if(totalbill>1000)
        {
            Discount=0.10*totalbill;
            totalbill-=Discount;
        }
        return totalbill;
    }
      void display()
    {
         System.out.println("Food Item Record");
        System.out.println("ID :"+itemId );
        System.out.println("Name :"+itemName);
        System.out.println("unitprice:"+unitPrice);
        System.out.println("quantity:"+quantity);
        System.out.println("Service Charge:"+deliveryFee);
        System.out.println("Subtotal:"+subtotal) ;
        System.out.println("GST:"+GST);
         System.out.printf("Discount: %.2f\n", Discount);
        System.out.println("Total Bill:"+totalbill);
    }}
  
public class Restaurantproject {
    public static void main(String[] args) {
        
        DineIn d=new DineIn("F102", "Paneer Butter Masala", 250.0, 4, 50.0);
        d.calculateBill();
        d.display();
        System.out.println();
        Takeaway t=new Takeaway("F104","Veg Briyani",180.0,2,20.0);
        t.calculateBill();
        t.display();
        System.out.println();
        Delivery ob=new Delivery("F103", "Chicken Pizza", 300.0, 4, 40.0);
        ob.calculateBill();
        ob.display();
    }
}
