import java.util.Scanner;
import java.util.Arrays;
public class Merge {
    public static void merge(int n,int m,int arr[],int arr1[])
    {
        arr=Arrays.copyOf(arr, n+m);
        for(int i=0;i<arr1.length;i++)
        {
            arr[n+i]=arr1[i];
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
       
        
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int arr1[]=new int[m];
        for(int i=0;i<m;i++)
        {
            arr1[i]=sc.nextInt();
        }
        merge(n, m, arr, arr1);
    }
}
