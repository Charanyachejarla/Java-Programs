import java.util.Scanner;
import java.util.Arrays;
public class Parity {
    public static void parity(int n, int arr[])
    {
        int arr1[]=new int[n];
        int l=0;int r=n-1;
        for(int i=0;i<n;i++)
        {
            if(arr[i]%2==0)
            {
                arr1[l++]=arr[i];

            }
            else{
                arr1[r--]=arr[i];
            }
        }
        System.out.println(Arrays.toString(arr1));
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
        parity(n, arr);
    }
}
