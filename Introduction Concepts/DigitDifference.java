import java.util.*;
import java.lang.Math;
public class DigitDifference {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        while(n>0)
        {
            int rem=n%10;
            sum=sum*10+rem;
            n/=10;
        }
        System.out.println(sum);
        int res=sum%10;
        int prev=sum%10;
        sum/=10;
        while(sum>0)
        {
            int rem=sum%10;
            int x=Math.abs(rem-prev);
            res=(res*10)+x;
            prev=rem;
            sum/=10;

        }
        System.out.println(res);
        
    }
}
