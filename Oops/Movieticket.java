abstract class movie 
{
    String movieId;
    String title;
    double ticketprice;
    int  numberOfTickets;
    movie(String movieId,String title,double ticketprice,int numberOfTickets)
    {
        this.movieId=movieId;
        this.title=title;
        this.ticketprice=ticketprice;
        this.numberOfTickets=numberOfTickets;
    }
    abstract double calculateprice();
    void display()
    {
        System.out.println("movie record");
        System.out.println("ID:"+movieId);
        System.out.println("Title"+title);
        System.out.println("Ticket price"+ticketprice);
        System.out.println("No of tickets"+numberOfTickets);
        
        if(numberOfTickets>6)
        {
            System.out.println("Booking Failed: Cannot book more than 6 tickets");
        }
        else{
            System.out.println("total price:"+calculateprice());
        }
    }
}
class Telugumovie extends movie{
    double subtotal;
    double GST;
    double total;
    Telugumovie(String movieId,String title,double ticketprice,int numberOfTickets)
    {
        
        super(movieId, title, ticketprice, numberOfTickets);
    }

    double calculateprice()
    {
        subtotal=ticketprice*numberOfTickets;
        GST=0.05*subtotal;
        total=GST+subtotal;
        return total;
    }
}
class HindiMovie extends movie
{
      double subtotal;
    double GST;
    double total;
    double Discount;
     HindiMovie(String movieId,String title,double ticketprice,int numberOfTickets)
    {
        
        super(movieId, title, ticketprice, numberOfTickets);
    }
    double calculateprice()
    {
        subtotal=ticketprice*numberOfTickets;
        Discount=0.10*subtotal;
        subtotal=subtotal-Discount;
        GST=0.05*subtotal;
        total=GST+subtotal;
        return total;
    }
}
class EnglishMovie extends movie{
    double subtotal;
    double GST;
    double total;
    double Discount;
    double fixed3Dcharge=50;
      EnglishMovie (String movieId,String title,double ticketprice,int numberOfTickets)
    {
        
        super(movieId, title, ticketprice, numberOfTickets);
    }
    double calculateprice()
    {
        subtotal=ticketprice*numberOfTickets;
        subtotal+=numberOfTickets*fixed3Dcharge;
        GST=0.05*subtotal;
        total=GST+subtotal;
        return total;

    }
}
public class Movieticket {
    public static void main(String[] args)
    {
        Telugumovie ob=new Telugumovie("M1", "Remo", 150, 2);
        ob.calculateprice();
        ob.display();
        System.out.println();
        HindiMovie h=new HindiMovie("M2","DADAK", 200,2);
        h.calculateprice();
        h.display();
        System.out.println();
        EnglishMovie e=new EnglishMovie("M3", "Dont Breath", 250, 7);
        e.calculateprice();
        e.display();
    }
}
