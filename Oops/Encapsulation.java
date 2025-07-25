class Student{
    private String name;
    private int rollno;
    public void setName(String n)
    {
        name=n;
    } public String getName()
    {
        return name;
    }
    public void setRollno(int r)
    {
        rollno=r;
    }
    public int  getRollno()
    {
        return rollno;
    }
   
}
public class Encapsulation {
    public static void main(String[] args)
    {
        Student s=new Student();
        s.setName("charanya");
        s.setRollno(530);
        System.out.println(s.getName());
        System.out.println(s.getRollno());
    }
}
