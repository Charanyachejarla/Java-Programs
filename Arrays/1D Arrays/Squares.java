import java.util.Scanner;

import java.util.Arrays;

public class Squares {
    public static void square(int n,int arr[])
    {
        int res[]=new int[n];
        for(int i=0;i<arr.length;i++)
        {
             res[i]=arr[i]*arr[i];
        }
        Arrays.sort(res);
        System.out.println(Arrays.toString(res));
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
        square(n, arr);
    }
}
