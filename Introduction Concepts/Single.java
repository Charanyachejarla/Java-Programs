/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Single
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int temp=n;
		int count=0;
		while(temp>0)
		{
		    int rem=temp%3;
		    if(rem>0 && rem<3)
		    {
		        int a=temp-1;
		        count++;
		        temp=a;
		        
		    }
		    else if(rem==0)
		    {
		        int a=temp/3;
		        count++;
		        temp=a;
		    }
		    
		}
		System.out.println(count);
	}
}