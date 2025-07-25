import java.util.*;
public class Removeduplicate {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        String res=" ";
       
       /*  StringBuffer bs=new StringBuffer("");
         for(int i=0;i<=str.length()-1;i++)
        {
            String temp=bs.toString();
            if(temp.indexOf(str.charAt(i))==-1)
            {
                bs=bs.append(str.charAt(i));
            }
        }
        System.out.println(bs);*/
       /* for(int i=0;i<=str.length()-1;i++)
        {
           
            if(res.indexOf(str.charAt(i))==-1)
            {
                res=res + (str.charAt(i));
            }
        }
        System.out.println(res);*/ 
        char[] chars=str.toCharArray();
        for(char ch:chars)
        {
            if(res.indexOf(ch)==-1)
            {
                res+=ch;
            }
        }
        System.out.println(res);
    }
}
