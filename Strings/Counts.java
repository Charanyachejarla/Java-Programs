import java.util.*;
import java.util.*;

public class Counts {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        str.toLowerCase();
        char[] chars=str.toCharArray();
        int conscount=0;
        int vowelscount=0;
        for(char ch:chars)
        {
            if("aeiou".indexOf(ch)!=-1)
            {
                vowelscount++;
            }
           /*  if(ch=='a' || ch=='e' || ch=='i' ||ch=='o'||ch=='u')
            {
                vowelscount++;
            }*/
            else{
                conscount++;
            }
        }
        System.out.println("vowels:"+vowelscount+" "+"consonants:"+conscount);
    }
}
