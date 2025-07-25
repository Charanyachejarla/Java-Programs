import java.util.*;
import java.lang.*;
public class Removeoccurance {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        String remove=sc.next();
        String result=str.replaceAll( remove, "");
        /*String result="";
        int i=0;
        while(i<=str.length()-remove.length())
        {
            if(str.substring(i, i+remove.length()).equals(remove))
            {
                i+=remove.length();
            }
            else{
                result+=str.charAt(i);
                i++;
            }
        }
        while(i<str.length())
        {
            result+=str.charAt(i);
            i++;
        }*/
        System.out.println(result);
    }
}
