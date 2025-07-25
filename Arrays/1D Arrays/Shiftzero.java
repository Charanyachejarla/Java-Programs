import java.util.*;
public class Shiftzero {
    public static void shift(int n,int arr[])
    {
        int arr1[] =new int[n];
        int j=0;
        
    
        
         for(int i=0;i<n;i++)
        {
            if(arr[i]!=0){
                arr1[j]=arr[i];
                j++;
            }  
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(arr1[i]+" ");
        }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[] =new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        shift(n, arr);
    }
}
