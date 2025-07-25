import java.util.Scanner;
import java.util.Arrays;
public class Shuffle {
    public static void shuffle(int n,int arr[])
    {
        int newarr[]=new int[2*n];
        int j=0;
        
        for(int i=0;i<n;i++)
        {
            newarr[j++]=arr[i];
            newarr[j++]=arr[i+n];
        }
        System.out.print(Arrays.toString(newarr));
       
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        int arr[]=new int[2*n];
        for(int i=0;i<2*n;i++)
        {
            arr[i]=sc.nextInt();
        }
        shuffle(n,arr);
    }
}
