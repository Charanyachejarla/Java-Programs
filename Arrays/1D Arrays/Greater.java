 import java.util.Scanner;
 import java.util.Arrays;
 public class Greater {
   
    public static void greater(int n,int arr[])
    {
         int max=-1;
         for(int i=n-1;i>=0;i--)
         {
            int val=arr[i];
            arr[i]=max;
            
                if(val>max)
                {
                    max=val;
                }
         }
         System.out.println(Arrays.toString(arr));
        
        
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
        greater(n, arr);
    }
}


