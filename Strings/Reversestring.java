import java.util.*;
import java.lang.String;
public class Reversestring {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String n=sc.next();
        StringBuffer bs=new StringBuffer("");
        for(int i=n.length()-1;i>=0;i--)
        {
           bs=bs.append(n.charAt(i));
        }
        System.out.println(bs);
        bs.reverse();
        System.out.println(bs);
        
        
        //Two pointers approach
        String str=sc.next();
        char[] chars=str.toCharArray();
        
        int left=0;
        int right =str.length()-1;
        while(left<right)
        {
            char temp=chars[left];
            chars[left]=chars[right];
            chars[right]=temp;
            left++;
            right--;
        }
        String res=new String(chars);
        System.out.println(res);
       
    }
}

