import java.util.*;
class substraction {
    public static int sum(int num1, int num2) {
        if(num1==num2)
        {
            return 0;
        }
        if(num2==0)
        {
            return num1;
        }
       
        if(num2<0)
        {
            return sum(num1+1,num2+1);
        }
        return sum(num1-1,num2-1);
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int res=sum(num1,num2);
        System.out.println(res);
    }
}