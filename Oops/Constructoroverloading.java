 class Constructor
 {
    
    int a=6;
    int b=7;
    Constructor(int a,int b)
    {
        System.out.println(a+b);
    }
    Constructor(double a,double b)
    {
        System.out.println(a*b);
    }
 }
public class Constructoroverloading {
    public static void main(String[] args)
    {
        Constructor ob=new Constructor(2,3);
        Constructor ob1=new Constructor(2.0,3.0);
    }
}
