import java.util.*;
public class Running {
    public static void replacesum(int n,int arr[])
    {
        int sum=0;
      
        for(int i=0;i<n;i++)
        {
            sum+=arr[i];
            System.out.print(sum+" ");
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
