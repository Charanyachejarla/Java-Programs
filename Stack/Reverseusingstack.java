import java.util.Stack;
import java.util.*;
class stackoperation{
    Stack<Character> stack=new Stack<>();
    void push(char str)
    {
        stack.push(str);
       
       
    }

    void display()
    {
        while(!(stack.isEmpty()))
        {
            System.out.print(stack.peek());
            stack.pop();
        }
    }
}
public class Reverseusingstack{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
          stackoperation ob=new stackoperation();
          for(int i=0;i<str.length();i++)
          {
            ob.push(str.charAt(i));
          }
          ob.display();
        
    }
}