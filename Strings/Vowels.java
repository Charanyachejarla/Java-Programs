import java.util.*;
public class Vowels {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String n=sc.next();
        StringBuilder consonants=new StringBuilder(); 
         StringBuilder vowels=new StringBuilder(); 
        char cons[]=n.toCharArray();
        char chars[]=n.toCharArray();
         System.out.print("characters:");
       for(char ch :chars)
       {
         if( !(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'))
         {
         
            System.out.print(ch+" ");
            consonants.append(ch);
            
         }
         
      }
         for(char cha:cons)
         {        
         if(cha=='a' || cha=='e' || cha=='i' || cha=='o' || cha=='u')
         {
            
            System.out.print(cha+" ");
            vowels.append(cha);
         }
      }
      String res=consonants.toString()+vowels.toString();
      System.out.println(res);
       
    }
}
