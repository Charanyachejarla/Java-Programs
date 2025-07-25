import java.util.*;
public class Small {
    public static void small(int n,int arr[])
    {
        int count=0;
        int max=0;
        for(int i=0;i<n;i++)
        {
            max=arr[i];
            for(int j=0;j<n;j++)
            {
                if(max>arr[j])
                {
                    count++;
                }
            } System.out.print(count+" ");
        count=0;
        }
       
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        small(n, arr);
    }
}
