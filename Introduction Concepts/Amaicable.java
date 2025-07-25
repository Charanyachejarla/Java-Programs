import java.util.*;
public class Amaicable {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n");
        int n=sc.nextInt();
        System.out.println("enter m");
        int m=sc.nextInt();
        int sum=0;
         for(int i=1;i<n;i++)
        {
            if(n%i==0)
            {
                sum+=i;
            }
        }
        int sum1=0;
        for(int j=1;j<m;j++)
        {
            if(m%j==0)
            {
                sum1+=j;
            }
        }
        if(n==sum1 && m==sum)
        {
            System.out.println("Amaicable");
        }
        else{
            System.out.println("not amaicable");
        }
    }
}
