
import java.util.*;
import java.lang.Math;
public class Count
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=0;
        double sum=0;
       
		while(n>0)
		{
		    count++;
		    int digits=n%10;
		     sum+=Math.pow(digits,count);
		    n=n/10;
		}
		System.out.print((int)sum);
	}
}