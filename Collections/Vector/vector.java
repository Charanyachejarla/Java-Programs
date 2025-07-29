
 import java.util.Iterator;
import java.util.Vector;
public class vector {
   

    public static void main(String[] args)
    {
        //create a Vector of strings
       Vector<String> vector=new Vector<>();

        //add()-Add elements at the end
        vector.add("Apple");
        vector.add("mango");
        vector.add("cherry");
        System.out.println("After add()"+vector);

        //add(index,element)-Insert element at specific index
        vector.add(1,"Banana");
        System.out.println("After add(1,\"banana\"):"+vector);

        //addFirst()-Add element at the start
       vector.addFirst("orange");
        System.out.println("After addFirst(\"orange\"):"+vector);

        //addLast()-Add element at the last
       vector.addLast("Grapes");
        System.out.println("After addLast(\"Grapes\"):"+vector);

        //get(index)
        System.out.println("elememt at index 2:"+vector.get(2));

        //getFirst() & getLast()
        System.out.println("First element:"+vector.getFirst());
         System.out.println("Second element:"+vector.getLast());

         //set(index,element)
        
         System.out.println("Ater set:"+vector.set(1, "pineapple"));

         //remove(index)
         vector.remove(3);
         System.out.println("After remov(3)"+vector);

         //remove(object)
        vector.remove("Apple");
         System.out.println("After remove(\"Apple\"):"+vector);
         //removeFirst() &removeLast()
         vector.removeFirst();
         System.out.println("After removeFirts()"+vector);
         vector.removeLast();
          System.out.println("After removeLast()"+vector);

          //contain(object)
          System.out.println("contains banana?"+vector.contains("banana"));

          //indexof() &lastIndex()
          vector.add("banana");
          vector.add("apple");
          vector.add("jackfruit");
          System.out.println("List now:"+vector);
          System.out.println("First index of jackfruit:"+vector.indexOf("jackfruit"));
          System.out.println("last indexof jackfruit:"+vector.lastIndexOf("jackfruit"));

          //size()
          System.out.println("Size of list:"+vector.size());

          //isEmpty()
          System.out.println("Is is empty?"+vector.isEmpty());

          //iterator
          System.out.println("iterating using iterator:");
          Iterator<String> it=vector.iterator();
          while(it.hasNext())
          {
            System.out.print(it.next()+" ");
          }
          System.out.println();

          
         
    }
}


