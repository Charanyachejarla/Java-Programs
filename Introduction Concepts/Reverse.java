import java.util.*;
public class Reverse {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n:");
        int n=sc.nextInt();
        System.out.println("enter m:");
        int m=sc.nextInt();
        int result=0; 
        while(n>0)
        {
            int rem=n%10;
            result=result*10+rem;
            n/=10;
  
        }
        int result1=0;

        while(m>0)
        {
            int rem=m%10;
            result1=result1*10+rem;
            m/=10;
        }
        if(result>=result1)
        {
            System.out.println(result);
        }
        else{
            System.out.println(result1);
        }
    }
}
