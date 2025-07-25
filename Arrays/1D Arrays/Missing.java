import java.util.*;
public class Missing {
    public static void missing(int n,int arr[])
    {
        int a=arr.length;
        int allsum=(a*(a+1))/2;
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum+=arr[i];
        }
        System.out.println(allsum-sum);

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
        missing(n, arr);
    }
}
