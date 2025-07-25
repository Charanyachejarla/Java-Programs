import java.util.*;
public class Replace {
    public static void replacesum(int n,int arr[])
    {
        int sum=0;
        int temp=0;
        for(int i=0;i<n-1;i++)
        {
            sum+=arr[i];
            temp=arr[i+1];
            arr[i+1]=sum;
            sum=temp;
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[] =new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        replacesum(n, arr);

    }
}
