import java.util.*;
public class Magicnum {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
       
        while(n>9)
        {
                 int sum=0;
                 int temp=n;
                 while(temp>0)
                 {
                      int rem=temp%10;
                      sum+=rem; 
                     temp/=10;
                }
                n=sum;
        }
        if(n==1)
        {
            System.out.println("magicnumber");
        }
        else{
            System.out.println("generic root");
        }
        

    }
}
