import java.util.*;
import java.lang.String;
public class Palindrom {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        char[] chars=str.toCharArray();
        int left=0;
        int right=str.length()-1;
        while(left<right)
        {
            char temp=chars[left];
            chars[left]=chars[right];
            chars[right]=temp;
            left++;
            right--;
        }
            String res=new String(chars);
            if(str.equals(res))
            {
                System.out.println("palindrom");
            }
            else{
                System.out.println("not a palindrom");
            }
            

        
    }
}
