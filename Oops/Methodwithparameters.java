// Methods with parameters
/*class Student1{
    String name ;
    int rollno;
    double marks;
    void display(String n,int r,double m)
    {
        System.out.println(n);
        System.out.println(r);
        System.out.println(m);
    }
}
public class Methodwithparameters {
    public static void  main(String[] args)
    {
        Student1 ob=new Student1();
        ob.display("charanya", 530, 30);
        ob.display("cherry", 31, 123);
       
    }
}*/
class Student1{
    String name="charanya" ;
    int rollno=123;
    double marks=12;
    void display(String n,int r,double m)
    {
        System.out.println(n);
        System.out.println(r);
        System.out.println(m);
    }
}
public class Methodwithparameters {
    public static void  main(String[] args)
    {
        Student1 ob=new Student1();
        ob.display(ob.name, ob.rollno,ob.marks);
    }
}
