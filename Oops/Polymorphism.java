class travelling{
    void travel(){
        System.out.println("travel to college");
    }
}
class cycle extends travelling{
    @Override
    void travel()
    {
        System.out.println("By cycle ");
    }
}
class bike extends travelling{
    @Override
    void travel()
    {
        System.out.println("By bike");
    }
}
class car extends travelling{
    @Override
    void travel()
    {
        System.out.println("By car");
    }
}
public class Polymorphism {
    public static void main(String[] args)
    {
        travelling a=new travelling();
        a.travel();
        a=new cycle();
        a.travel();
        a=new car();
        a.travel();
        a=new bike();
        a.travel();
    }
}
