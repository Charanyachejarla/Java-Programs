class First{
    int a=10,b=20;
    void sum()
    {
        System.out.println(a+b);
    }
}
class Second extends First{
    
    void sub()
    {
        System.out.println(a-b);
    }

}

public class Inheritance {
    public static void main(String[] args)
    {
        Second ob=new Second();
        ob.sum();
        ob.sub();
    }
}
