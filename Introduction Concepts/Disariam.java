
    //disariam problem
import java.util.*;
import java.lang.Math;
public class Disariam
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=0;
		int temp=n;
        double sum=0;
       
		while(n>0)
		{
		    int digits=n%10;
		    count++;
		    System.out.println(digits);
		    n=n/10;
		    
		}
		System.out.println(count);
		for(int i=count;i>=1;i--)
		{
		    int rem=temp%10;
		    sum+=Math.pow(rem, i);
		     temp=temp/10;
		}
		System.out.println((int)sum);
		
		
	}
}



