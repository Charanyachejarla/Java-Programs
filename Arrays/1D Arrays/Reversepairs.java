import java.util.*;
public class Reversepairs {
    public static void pairs(int n,int arr[])
    {
        int temp=0;
        for(int i=0;i<n-1;i+=4)
        {
                 temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
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
        pairs(n, arr);
    }
}
