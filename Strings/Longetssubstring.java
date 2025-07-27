import java.util.*;

public class Longetssubstring {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        String current="";
        String longest="";
       
        char[] chars=str.toCharArray();
        for(char ch:chars)
        {
            int res=current.indexOf(ch);
            if( res!=-1)
            {
                current=current.substring(res+1);
            }current+=ch;
        }
        if(current.length()>longest.length())
        {
            longest=current;
        }
         System.out.println(longest.length());
         
    }
}
