import java.util.*;
public class Sum {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int evensum=0;
        int oddsum=0;
        
        for(int i=0;i<n;i++)
        {
            if(arr[i]%2==0)
            {
                evensum+=arr[i];
            }
            else{
                oddsum+=arr[i];
            }
        }
        System.out.println(oddsum-evensum);
        
    }
}
