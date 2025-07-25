import java.util.Scanner;
import java.util.Arrays;
public class Plusone {
    public static void plus(int n,int arr[])
    {
        int a=0;
        for(int i=0;i<n;i++)
        {
            int temp=arr[i];
            while(temp>0)
            {
                int rem=temp%10;
                a=a*10+rem;
                temp/=10;
            }
    }
        a=a+1;
            int len = (int)Math.log10(a) + 1;
        int[] digits = new int[len];

        int index = len - 1;
        while (a > 0) {
            digits[index] = a % 10;
            a /= 10;
            index--;
        }

        System.out.println(Arrays.toString(digits));
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
        plus(n, arr);
    }
}
