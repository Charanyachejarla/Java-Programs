import java.util.Arrays;
import java.util.Scanner;
public class Arraymethods {
    public static void methods(int n,int arr[])
    {
       /*Arrays.sort(arr);
        for(int num:arr)
        {
            System.out.print(num+" ");
        }
        System.out.println(Arrays.toString(arr));*/
        
        //System.out.println( Arrays.equals(arr,arr1));
        int[] copy=Arrays.copyOf(arr, 6);
        System.out.println(Arrays.toString(copy));
        /*int[] rangeCopy =Arrays.copyOfRange(arr, 1, 2);
        System.out.println(Arrays.toString(rangeCopy));*/
        /*int[] filled =new int[4];
        Arrays.fill(filled,9);
        System.out.println(Arrays.toString(filled));*/

    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        //int m=sc.nextInt();
        int arr[]=new int[n];
        //int arr1[]=new int[m];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        /*for(int i=0;i<m;i++)
        {
            arr1[i]=sc.nextInt();
        }*/
        methods(n, arr);
    }
}
