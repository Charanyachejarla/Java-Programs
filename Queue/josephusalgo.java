import java.util.*;
public class josephusalgo{
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int count=0;
        int count1=0;
        int i=0;
        while(true)
        {
           if(arr[i]!=-1)
            {
                count++;
            }
            if(count==k)
            {
                arr[i]=-1;
                count1++;
                count=0;
            }
            if(count1==n-1)
            {
                break;  
            }i=(i+1)%n;
        }
        for(int j=0;j<n;j++)
        {
            if(arr[j]!=-1)
            {
                System.out.println(arr[j]);
            }
        }
       /*int res=0;
       for(int i=2;i<=n;i++)
       {
        res=(res+k)%i;
       }
       System.out.println( res);*/
    }
}