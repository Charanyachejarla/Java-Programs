
 class Student1 {

    String name;
    int rollno;
    double marks;
    void display()
    {
        System.out.println(name+" "+rollno+" "+marks);
    }
}
public class Classobjects{
    public static void main(String[] args)
    {
        Student1 s1=new Student1();

        s1.name="charanya";
        s1.rollno=530;
        s1.marks=58.25;
        s1.display();
    }
} 
