 class Student1 {
    static String name="charanya";
    static int rollno=530;
    static double marks=59;
    static void display()
    {
        System.out.println(name+" "+rollno+" "+marks);
    }
}
public class Staticvariablemethods
{
    public static void main(String[] args)
    {
        Student1 s1=new Student1();
        Student1.display();//accessed by class name
        System.out.println(Student1.name);
         System.out.println(Student1.rollno);
          System.out.println(Student1.marks);
    }
}