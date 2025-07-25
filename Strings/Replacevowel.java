import java.util.*;
import java.lang.*;
public class Replacevowel {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        char[] chars=str.toCharArray();
        for(int i=0;i<=str.length()-1;i++)
        { 
          if(chars[i]=='a' || chars[i]=='e'||chars[i]=='i'||chars[i]=='o'||chars[i]=='u')
            {
              chars[i]='@';
              
            }
           
        }
        String res=new String(chars);
        System.out.println(res);


    }
}
