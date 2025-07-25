import java.util.Scanner;
import java.lang.Math;
public class Timetobuy {
    public static void best(int n,int arr[])
    {
       int max=Integer.MIN_VALUE;
       for(int i=0;i<n-1;i++)
       {
            int temp=0;
            for(int j=i+1;j<n;j++)
            {
                if(arr[j]-arr[i]>temp)
                {
                    temp=arr[j]-arr[i];
                }
                
            }
            if(temp>max)
            {
                max=temp;
            }
       }
       /*int max=0;
       for(int i=0;i<n;i++)
       {
            if(temp[i]>max)
            {
                
                max=temp[i];
            }
       }*/
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
        best(n, arr);
    }
}
