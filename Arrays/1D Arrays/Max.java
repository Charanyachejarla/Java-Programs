import java.util.*;
public class Max {
    public static void max(int n,int arr[])
    {
        int count=0;
        int max=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==1)
            {
                count+=1;
                
            }
            else{
                if(count>max)
                {
                    max=count;
                }
                count=0;
            }
        }
        if(count>max)
        {
             max=count;
        }
        System.out.println(max);
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
        max(n, arr);
    }
}
