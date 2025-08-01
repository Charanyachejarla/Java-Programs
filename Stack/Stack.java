
class stackoperation{
        int maxsize;
        int top=-1;
        stackoperation(int n)
       {
          maxsize=n;
       }
    void push(int data,int[] arr)
    {
        if(top==maxsize-1)
        {
            System.out.println("overflow");
        }
        arr[++top]=data;
    }
    void pop()
    {
        if(top==-1)
        {
            System.out.println("stack is empty");
        }
        top--;
    }
    void peek(int[] arr)
    {
        System.out.println(arr[top]);
    }
    void traversal(int[] arr)
    {
        int t=top;
        while(t!=-1)
        {
            System.out.println(arr[t]+" ");
            t--;
        }
    }
    
}
public class Stack{
    public static void main(String[] args)
    {
        int[] arr=new int[5];
        stackoperation ob=new stackoperation(5);
        ob.push(10,arr);
        ob.push(20,arr);
        ob.push(30,arr);
        ob.traversal(arr);
        System.out.println();
        ob.pop();
        ob.traversal(arr);
        System.out.println();
        ob.peek(arr);
        
    }
}