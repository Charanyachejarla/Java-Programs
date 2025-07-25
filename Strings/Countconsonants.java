import java.util.*;
public class Countconsonants {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        
        String n=sc.next();
         char[] chars=n.toCharArray();
         int count=0;
       System.out.print("characters:");
       for(int ch :chars)
       {
         if(ch!='A' && ch!='E' & ch!='I' && ch!='O' && ch!='U' && ch!='a' && ch!='e' & ch!='i' && ch!='o' && ch!='u')
         {
            
            //System.out.println(ch+" ");
            count++;
         }
       }
       System.out.println(count);

    }
}
