class Student{
    void display()
    {
        System.out.println("hello");
    }
    String name="charanya";
    int rollno=530;
    double marks=56.9;
    String display(String name)
    {
       return name;
    }
    void display(String name,int rollno,double marks)
    {
        System.out.println(name+" "+rollno+" "+marks);
    }
    int display(int a, int b)
    {
        return a+b;
        
    }
}
public class Methodoverloading {
    public static void main(String[] args)
    {
        Student s1=new Student();
        s1.display();
       String res=s1.display(s1.name);
       System.out.println(res);
        s1.display(s1.name, s1.rollno, s1.marks);
        int res1=s1.display(4, 7);
        System.out.println(res1);
    }
}
