import java.util.*;
import java.lang.Math;
public class Jumpingnumber {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       
        int temp=n%10;
        n/=10;
        boolean flag=true;
        while(n>0)
        {
            int rem=n%10;
            if(Math.abs(rem-temp)!=1)
            {
                flag=false;
                break;
            }temp=rem;
            n/=10;
        }
        if(flag)
        {
            System.out.println("jumping number");
        }
        else{
            System.out.println("not a jumping number");
        }

    }
}
