import java.util.*;
public class Duplicates {
    public static int contain(int n, int arr[])
    {
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]==arr[j])
                {
                    return i;
                }
                
            }
        }
        return -1;
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
       int index= contain(n, arr);
       if(index!=-1)
       {
        System.out.println(arr[index]);
       }

    }
}
