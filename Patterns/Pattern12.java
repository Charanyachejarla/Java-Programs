    
import java.util.*;
public class Pattern12 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {

            for(int j=1;j<=n;j++)
            {
                if( i==1)
                {
                    System.out.print(j+" ");
                }
                else if(j==i){
                   System.out.print(1+" "); 
                }
                else if(j==n)
                {
                    System.out.print(n-i+1+" "); 
                }
                else{
                    System.out.print("  ");
                }
                
            }
            System.out.println();
        }
    }
}








