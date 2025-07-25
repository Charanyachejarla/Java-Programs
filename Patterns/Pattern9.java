
import java.util.*;
public class Pattern9 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=n;j>=i;j--)
            {
                if(j==n || j==i || i==1)
                {
                    System.out.print("* ");
                }
                else{
                   System.out.print("  "); 
                }
                
            }
            System.out.println();
        }
    }
}






