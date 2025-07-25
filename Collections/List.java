import java.util.Iterator;
import java.util.LinkedList;
public class List {
    public static void main(String[] args)
    {
        //create a linkedlist of strings
        LinkedList<String> list=new LinkedList<>();
        //add()-Add elements at the end
        list.add("Apple");
        list.add("mango");
        list.add("cherry");
        System.out.println("After add()"+list);

        //add(index,element)-Insert element at specific index
        list.add(1,"Banana");
        System.out.println("After add(1,\"banana\"):"+list);

        //addFirst()-Add element at the start
        list.addFirst("orange");
        System.out.println("After addFirst(\"orange\"):"+list);

        //addLast()-Add element at the last
        list.addLast("Grapes");
        System.out.println("After addLast(\"Grapes\"):"+list);

        //get(index)
        System.out.println("elememt at index 2:"+list.get(2));

        //getFirst() & getLast()
        System.out.println("First element:"+list.getFirst());
         System.out.println("Second element:"+list.getLast());

         //set(index,element)
        
         System.out.println("Ater set:"+list.set(1, "pineapple"));

         //remove(index)
         list.remove(3);
         System.out.println("After remov(3)"+list);

         //remove(object)
         list.remove("Apple");
         System.out.println("After remove(\"Apple\"):"+list);
         //removeFirst() &removeLast()
         list.removeFirst();
         System.out.println("After removeFirts()"+list);
         list.removeLast();
          System.out.println("After removeLast()"+list);

          //contain(object)
          System.out.println("contains banana?"+list.contains("banana"));

          //indexof() &lastIndex()
          list.add("banana");
          list.add("apple");
          list.add("jackfruit");
          System.out.println("List now:"+list);
          System.out.println("First index of jackfruit:"+list.indexOf("jackfruit"));
          System.out.println("last indexof jackfruit:"+list.lastIndexOf("jackfruit"));

          //size()
          System.out.println("Size of list:"+list.size());

          //isEmpty()
          System.out.println("Is is empty?"+list.isEmpty());

          //iterator
          System.out.println("iterating using iterator:");
          Iterator<String> it=list.iterator();
          while(it.hasNext())
          {
            System.out.print(it.next()+" ");
          }
          System.out.println();

          //descendingIterator()
          System.out.println("Iterating in reverse order:");
          Iterator<String>descIt=list.descendingIterator();
          while(descIt.hasNext())
          {
            System.out.print(descIt.next()+" ");
          }
          System.out.println();

          //peek()
          System.out.println("peek(head element):"+list.peek());

          //poll
          System.out.println("poll (removes head):"+list.poll());

          //offer(),offerFirst(),offerLast()
          list.offer("kiwi");
          list.offerFirst("Lemon");
          list.offerLast("Berry");
          System.out.println("After offer operations:"+list);

          //toArray()
          Object[]arr=list.toArray();
          System.out.println("Array version:");
          for(Object obj:arr)
          {
            System.out.print(obj+" ");
          }
          System.out.println();

          //clear()
          list.clear();
          System.out.println("After clear():"+list);
    }
}
