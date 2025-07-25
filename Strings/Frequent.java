import java.util.*;
public class Frequent {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int[] freq=new int[256];
        for(int i=0;i<str.length();i++)
        {
            freq[str.charAt(i)]++;
        }
        int max=freq[str.charAt(0)];
        for(int i=0;i<str.length();i++)
        {
            if(freq[str.charAt(i)]>max)
            {
                max=freq[str.charAt(i)];
                freq[str.charAt(i)]=0;
            }

        }
        System.out.println(max);

       
    }
}
