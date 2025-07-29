import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class Main {
    public static void main(String[] args){
        //ArrayList()
        //create arraylist of integers
        ArrayList<Integer> n=new ArrayList<>();
        n.add(2);
        n.add(3);
        System.out.println("intial list"+n);
        //inserting an integer ata a position
        n.add(1,15);
        System.out.println("After inserting 15 at index 1:"+n);

        //Accesing element at particular index n.get(index)
        System.out.println("element at index 2:"+n.get(2));

        //Replacing element at an index with another element
        n.set(2,25);
        System.out.println("replacing element at index 2 with 25:"+n);

        //removing element at particular index
        n.remove(1);
        System.out.println("After removing element at index 1:"+n);

        //Removing particular value from the arraylist
        n.remove(Integer.valueOf(15));
        System.out.println("After removing value 15 from the n"+n);

       //n.contains(element)tells whether the element present in the n or not
       System.out.println("Do 10 is present in the n:"+n.contains(2));

       //n.size() give size of the n
       System.out.println("Size of the n:"+n.size());

       //n.isempty() tell whether the n is empty or not
       System.out.println("is n empty or not:"+n.isEmpty());

       //iterator()
        System.out.println("using iterator");
        Iterator<Integer> it=n.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
        System.out.println();

    }
}
