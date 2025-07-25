import java.util.*;
public class Pivot {
    public static int pivot(int n, int arr[])
    {
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum+=arr[i];
        }
        int leftsum=0;
        for(int i=0;i<n-1;i++)
        {
            if(leftsum==sum-leftsum-arr[i])
            {
                return i;
            }
            leftsum+=arr[i];
        }
        return -1;
    }
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int arr[] =new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
       int res= pivot(n, arr);
       System.out.println(res);

    }
}
