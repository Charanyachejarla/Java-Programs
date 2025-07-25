import java.util.*;
public class Parking 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n<=0)
		{
		    System.out.println("invaild");
		}
	    if(n<=2)
	    {
	        System.out.println(50);
	    }
	    else{
	        System.out.println(50+(n-2)*20);
	    }
	}
}

