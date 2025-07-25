import java.util.*;
public class Duplicates {
    public static void main(String[] args)
    {
        HashSet<Integer>set=new HashSet<>();
        
        for(int i:nums)
        {
            if(set.contains(i))
            {
                System.out.println("True");
            }
            set.add(i);
        }
        System.out.println("False");



    }
}
