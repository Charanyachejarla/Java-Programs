import java.util.Scanner;
import java.util.Arrays;
public class Mountainarray {
    public static boolean mountain(int n,int arr[])
    {
        
        if(arr[0]-arr[1]==3)
        {
            return true;
        }
         
        if(arr[1]-arr[2]==1)
        {
            return true;

        }
        return false;
        
        
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
        boolean res=mountain(n, arr);
        System.out.println(res);
    }
}
