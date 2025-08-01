import java.util.*;
import java.util.Stack;
public class postfix{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        Stack<Integer> stack=new Stack<>();
        
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(Character.isDigit(ch))
            {
                stack.push(ch -'0');
            }
            else{
                int b=stack.pop();
                int a=stack.pop();
                switch(str.charAt(i))
                {
                    case '+':
                        stack.push(a+b);
                        break;
                    case '-':
                        stack.push(a-b);
                        break;
                    case '*':
                        stack.push(a*b);
                        break;
                    case '/':
                        stack.push(a/b);
                        break;
                    default:
                        System.out.println("invalid");
                }

            }
        }
            System.out.print(stack.pop());
        
    }
}