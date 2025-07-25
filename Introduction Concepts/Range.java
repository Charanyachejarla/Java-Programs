import java.util.*;
public class Range {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
     for(int j=1;j<=n;j++)
     {
         int sum=0;
         int temp=j;
        while(temp>0)
        {
            int fact=1;
            int rem=j%10;
            for(int i=rem;i>=1;i--)
            {
                fact=fact*i;
            }
            sum+=fact;
            temp/=10;

        }
        if(j==sum)
        {
            System.out.println(j);
        }
       
     }
}
}
