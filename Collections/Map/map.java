import java.util.*;
public class map {
    public static void main(String[] args){
        //create a hashmap
        Map<Integer,String> map=new HashMap<>();

        //put(K key,v v value)
        map.put(1,"Apple");
        map.put(2,"banana");
        map.put(3,"mango");
        System.out.println("After put():"+map);

        //putAll(Map, m)
        Map<Integer,String>anotherMap=new HashMap<>();
        anotherMap.put(4,"cherry");
        anotherMap.put(5,"kiwi");
        map.putAll(anotherMap);
        System.out.println("After putAll:"+map);

        //get(object key)
        System.out.println("get(2):"+map.get(2));

        //remove(object key)
        map.remove(3);
        System.out.println("After remove(3):"+map);

        //conatinskey(object key)
        System.out.println("containsKey(1):"+map.containsKey(map.containsKey(1)));

        //containsValue(object value)
        System.out.println("containsValue(\"kiwi\"):"+map.containsValue("kiwi"));

        //size()
        System.out.println("size of :"+map.size());

        //isempty
        System.out.println("is map empty or not:"+map.isEmpty());

        Collection<String> value=map.values();
        System.out.println("values():"+value);

        //entry set
        Set<Map.Entry<Integer, String>> entries=map.entrySet();
        System.out.println("entrySet():"+entries);
        System.out.println("iterating entryset():");
        for(Map.Entry<Integer,String>e:entries)
        {
            System.out.println("key:"+e.getKey()+"value:"+e.getValue());
        }
    }
}
