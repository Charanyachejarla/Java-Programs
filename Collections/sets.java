import java.util.*;
public class sets {
    public static void main(String[] args)
    {
        //create set
        Set<String> set=new HashSet<>();
        // add() 
        set.add("Apple");
        set.add("banana");
        set.add("grapes");
        set.add("Apple");
        System.out.println("set :"+set);
        //remove
        set.remove("grapes");
        System.out.println("After remove: "+set);

        //contains(object o)
        boolean hasApple=set.contains("Apple");
        System.out.println("contains'Apple'?:"+hasApple);

        //iterator
        System.out.println("iterate with iterator");
        Iterator<String> it=set.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next()+" ");
        }System.out.println();

        //toArray
        Object[] array=set.toArray();
        System.out.println("Array version");
           for(Object obj:array)
          {
            System.out.print(obj+" ");
          }
          System.out.println();


         
    }
}
