import java.util.*;
public class Mirroredarray {
    public static boolean Mirrored(int n,int arr[])
    {
        boolean flag=true;
        for(int i=0;i<n;i++)
        {
            if(arr[i]!=arr[n-1-i])
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args)
    {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    if(n%2!=0)
    {
        System.out.println("can't form a mirror array ");
        return;
    }
    
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
    {
        arr[i]=sc.nextInt();
    }
    boolean res=Mirrored(n, arr);
    if(res)
    {
        System.out.println("it is mirrored array");
    }
    else{
        System.out.println("it is not a mirrored array");
    }
 }
}
