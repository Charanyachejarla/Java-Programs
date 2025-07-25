import java.util.*;
public class Library {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n<=0)
        {
            System.out.println("inavlid");
        }
        if(n<=5)
        {
            System.out.println(n*2);
        }
        else if(n<=10)
        {
            System.out.println(10+(n-5)*3);
        }
        else{
            int fine=25+(n-10)*5;
            System.out.println("Total fine:"+ fine);
        }
      
    }
}
