//default constructor 
/*class Constructor1 {
    String name;
    int rollno;
    double marks;
    void display()
    {
        System.out.println(name+" "+rollno+" "+marks);
    }
    Constructor1()
    {
        name="charanya";
        rollno=123;
        marks=12;
        System.out.println("hello");
    }
}
public class Constructor {
    public static void main(String[] args)
    {
        Constructor1 ob=new Constructor1();
        ob.display();
    }
}*/

// parameterized constructor 
class Constructor1 {
    String name;
    int rollno;
    double marks;
    void display()
    {
        System.out.println(name+" "+rollno+" "+marks);
    }
   /*  Constructor1(String n,int r,double m)
    {
        name=n;
        rollno=r;
        marks=m;
      
    }*/
    Constructor1(String name,int rollno,double marks)
    {
        name=this.name;
        rollno=this.rollno;
        marks=this.marks;
      
    }
}
public class Constructor {
    public static void main(String[] args)
    {
        Constructor1 ob=new Constructor1("charanya",123,45.98);
        ob.display();
    }
}


