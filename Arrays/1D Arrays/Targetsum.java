import java.util.*;
public class Targetsum {
    public static void sum(int n, int arr[], int target)
    {
        int sum=0;
        for(int i=0;i<n;i++)
        {
            
            for(int j=0;j<n;j++)
            {
                
                    sum=arr[i]+arr[j];
                    if(sum==target)
                    {
                        System.out.println(i +" "+j);
                        return;
                    }
                
                
            }
        }
        System.out.println(-1+" "+-1);
    }
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int target=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        sum(n, arr, target);
    }
}
