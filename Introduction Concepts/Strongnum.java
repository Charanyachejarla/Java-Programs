import java.util.*;
public class Strongnum {
    public static void main(String[] args)
    {
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         int sum=0;
         int temp=n;
        while(n>0)
        {
            int fact=1;
            int rem=n%10;
            for(int i=rem;i>=1;i--)
            {
                fact=fact*i;
            }
            sum+=fact;
            n/=10;

        }
        if(temp==sum)
        {
            System.out.println("Strong");
        }
        else{
            System.out.println("not Strong");
        }

   }
}
