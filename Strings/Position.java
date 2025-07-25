import java.util.Scanner;

public class Position {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        String word="";
        
        for(int i=0;i<=str.length()-1;i++)
        {
            char ch=str.charAt(i);
            if("aeiou".indexOf(ch)!=-1)
            {
                for(int j=0;j<i+1;j++)
                {
                    word+=ch;
                }
            }
            else{
                word+=ch;
            }
            
         }   
        
        System.out.println(word);
    }
}
