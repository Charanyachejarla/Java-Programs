import java.util.*;
import java.util.Stack;
public class infix{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        StringBuilder res=new StringBuilder("");
        Stack<Character> stack=new Stack<>();
        Map<Character,Integer> map=new HashMap<>();
        map.put('+',1);
        map.put('-',1);
        map.put('*',2);
        map.put('/',2);
        map.put('^',3);
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(Character.isAlphabetic(ch))
            {
                res.append(ch);
            }
            else if(ch=='(')
            {
                stack.push(ch);
            }
            else if(ch==')')
            {
                while(!stack.isEmpty() && stack.peek()!='(')
                  res.append(stack.pop());
                if(!stack.isEmpty() && stack.peek()=='(')
                stack.pop();
            }
             else{
              
                while(!stack.isEmpty() && stack.peek() != '(' && map.get(ch) <= map.get(stack.peek()))
                {
                    res.append(stack.pop());
                }
                stack.push(ch);
            }
        }

        
        while(!stack.isEmpty())
        {
            res.append(stack.pop());
        }

        System.out.println(res.toString());
        sc.close();
    }
                
}
           
            
        
        
    
