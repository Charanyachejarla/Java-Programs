import java.util.*;
import java.lang.Math;
public class Balanced {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int len=(int)Math.log10(n)+1;
        System.out.println(len);
        int sum=0;
        while(n>0)
        {
            int rem=n%10;
            sum=sum*10+rem;
            n/=10;
        }
        System.out.println(sum);
        int leftsum=0;
        int rightsum=0;
        
        
        for(int i=1;i<=len/2;i++)
        {
            int rem=sum%10;
            leftsum+=rem;
            sum/=10;
        }
        System.out.println(leftsum);
        if(len%2!=0)
        {
            sum/=10;
        }

        for(int i=1;i<=len/2;i++)
        {
            int rem=sum%10;
            rightsum+=rem;
            sum/=10;
           
        }
        System.out.println(rightsum);
        if(leftsum==rightsum)
        {
            System.out.println("Balanced");
        }

        else{
            System.out.println("not balanced");
        }
    
   

    }
}

