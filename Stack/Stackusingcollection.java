import java.util.Stack;
class stackoperation{
    Stack<Integer> stack=new Stack<>();
    void push(int val)
    {
        stack.push(val);
        System.out.println(val+" "+"pushed");
    }
    void pop()
    {
        if(stack.isEmpty())
        {
            System.out.println("stack underflow");
        }
        else{
            System.out.println("popped"+" "+stack.pop());
        }
    }
    void peek(){
        if(stack.isEmpty())
        {
            System.out.println("stack is empty");
        }
        else{
            System.out.println("peek"+" "+stack.peek());
        }
    }
    void display()
    {
        if(stack.isEmpty())
        {
            System.out.println("stack is empty");
            return;
        }
        System.out.print("Stack:");
        for(int i=stack.size()-1;i>=0;i--)
        {
            System.out.print(stack.get(i)+" ");
        }
        System.out.println();
    }
}
public class Stackusingcollection{
    public static void main(String[] args)
    {
        stackoperation ob=new stackoperation();
        ob.push(10);
        ob.push(20);
        ob.push(30);
        ob.display();
        ob.pop();
        ob.display();
        ob.peek();
       
        
    }
}