interface First  {
    abstract void sum(int a,int b);
}
interface Second extends First{
    abstract void mul(int a,int b);
}
interface Third extends Second{
    abstract void sub(int a,int b);
}
class Four implements Third{
    public void sum(int a,int b)
    {
        System.out.println(a+b);
    }
    public void mul(int a,int b)
    {
        System.out.println(a*b);
    }
    public void sub(int a,int b)
    {
        System.out.println(a-b);
    }
}

public class Extendinterface {
    public static void main(String[] args)
    {
        Four ob=new Four();
    ob.sum(3,4);
    ob.mul(2,3);
    ob.sub(4,5);
    }
    

}
