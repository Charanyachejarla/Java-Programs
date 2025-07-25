import java.util.*;
import java.lang.Math;
public class Evendigits {
    public static void even(int n,int arr[])
    {
       /* int count=0;
        for(int i=0;i<n;i++)
        {
            int digits=(int)Math.log10(arr[i])+1;
            if(digits%2==0)
            {
                count++;
            } 
        }
        System.out.println(count);*/ 
        int ed=0;
        for(int i=0;i<n;i++)
        {
            int temp=arr[i];
            int count=0;
            while(temp>0)
            {
                temp=temp/10;
                count++;
            }
            if(count%2==0)
            {
                ed++;
            }
        }
        System.out.println(ed);
       

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
        even(n, arr);
    }
}
