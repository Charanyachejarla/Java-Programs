import java.util.*;
public class Method {
    public static void evensum_oddsum(int n,int arr[])
    {   
        int evensum=0;
        int oddsum=0;
         for(int i=0;i<n;i++)
        {
            if(i%2==0)
            {
                evensum+=arr[i];
            }
            else{
                oddsum+=arr[i];
            }
        } 
        System.out.println(evensum-oddsum);
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
       
        evensum_oddsum(n, arr);
       
       
        
    }
}
