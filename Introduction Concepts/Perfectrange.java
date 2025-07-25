
import java.util.*;
public class Perfectrange {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        
        for(int j=1;j<m;j++)
        {
            int sum=0;
            int temp=j;
        for(int i=1;i<temp;i++)
        {
            if(temp%i==0)
            {
                sum+=i;
            }
        }
        if(temp==sum)
        {
            System.out.println(temp);
        }
        
    }
}
}


