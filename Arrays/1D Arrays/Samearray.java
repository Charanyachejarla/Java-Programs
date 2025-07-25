import java.util.*;
public class Samearray {
    public static boolean arrays(int n,int m,int arr[],int arr2[])
    {
        boolean flag=false;
        for(int i=0;i<n;i++)
        {
            if(arr.length!=arr2.length)
            {
                return false;
            }
            if(arr[i]!=arr2[i])
            {
                return false;
            }
        }
        return true;
        
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        if(n!=m){
         System.out.println("not equal");
        }
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int arr2[]=new int[m];
        for(int i=0;i<m;i++)
        {
            arr2[i]=sc.nextInt();
        }
        boolean res=arrays(n, m,arr, arr2);
        if(res)
        {
            System.out.println("Equal");
        }
        else{
            System.out.println("Not Equal");
        }
    }
}
