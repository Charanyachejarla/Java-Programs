import java.util.*;
import java.lang.Math;
public class Vowelsdiff {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        char[] chars=str.toCharArray();
        int count=0;
        int count1=0;
        for(int i=0;i<str.length()/2;i++)
        {
            if(chars[i]=='a'|| chars[i]=='e'|| chars[i]=='i'|| chars[i]=='o' || chars[i]=='u')
            {
                count++;
            }
        }
         for(int i=str.length()/2;i<=str.length()-1;i++)
        {
            if(chars[i]=='a'|| chars[i]=='e'|| chars[i]=='i'|| chars[i]=='o' || chars[i]=='u')
            {
                count1++;
            }
        }
        System.out.println(Math.abs(count-count1));
    }
}
