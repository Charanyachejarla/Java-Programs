/*class First{
    int a,b;
    First(int x, int y)
    {
        System.out.println("First class constructor");
        a=x;
        b=y;
    }
    void sum()
    {
        System.out.println(a+b);
    }
}
class Second extends First{
    Second()
    {
        super(10,20);
        System.out.println("Second class constructor");
    }
  
}
    public class Super {
    public static void main(String[] args)
    {
        Second ob=new Second();
        ob.sum();
    }
}*/
//Super keyword accessing
/*class First {
    int a=10;
    First()
    {
        System.out.println("first class constructor");
    }
}
class  Second extends First{
    int a=15;
    Second()
    {
        System.out.println("second class constructor");
    }

void display()
{
    System.out.println(a);
    System.out.println(super.a);
    System.out.println(a*super.a);
}
}

public class Super {
    public static void main(String[] args)
    {
        Second ob=new Second();
        ob.display();
    }
}*/
//accessing methods using super
class First{
    int a,b;
    First()
    {
        System.out.println("First class constructor");
    }
    First(int x,int y)
    {
        a=x;
        b=y;
    }
    void sum()
    {
        System.out.println(a+b);
    }
    void sub()
    {
        System.out.println(a-b);
    }
}
    class Second extends First{
        Second()
        {
            super(100,150);
            super.sum();
            super.sub();
        }
    }
    public class Super {
    
         public static void main(String[] args)
         {
            Second ob=new Second();
          
         }
    }

