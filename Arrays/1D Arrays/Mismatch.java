import java.util.Scanner;
import java.util.Arrays;
public class Mismatch {
    public static void height(int n,int arr[])
    {
        int arr1[]=new int[n]; 
        for(int i=0;i<n;i++)
        {
            arr1[i]=arr[i];
        }
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));
        int count=0;
       for(int i=0;i<n;i++)
       {
        if(arr[i]!=arr1[i])
        {
            count++;
        }
       }
       System.out.println(count);
       

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
        height(n, arr);
    }
}
