
    import java.util.*;
public class Evenodd
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int rem=0;
		int sum=0;
		while(n!=0)
		{
		   rem=n%10;
		   sum=sum*10+rem;
		   n/=10;
		   
		}
		System.out.println(sum);
        int even=0;
        int odd=0;
       while(sum!=0)
        {
             int res=sum%10;
             if(res%2==0)
             {
                even=even*10+res;
             }
             else{
                odd=odd*10+res;
             }
             sum=sum/10;

        }
        System.out.println(even-odd);
		
	}
}
