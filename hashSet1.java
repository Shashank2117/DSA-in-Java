import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;


public class hashSet1 {
    
    public static void main(String[] args) {

        System.out.println("HashSet ");
        HashSet <String> set = new HashSet <> ();

        set.add("hiii");
        set.add("Hello");
        set.add("hello");
        set.add("hiii");
        set.add("wowwww");
        set.remove("hiii");
        System.out.println(set);




        System.out.println();




        System.out.println("TreeSet ");
        TreeSet <Integer> data = new TreeSet <> ();

        data.add(5);
        data.add(7);
        data.add(3);

        System.out.println(data.contains(7));
        data.remove(3);
        
        System.out.println(data);




        System.out.println();




        HashMap <String, Integer> map = new HashMap <> ();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        map.put("four", 4);
        

        System.out.println(map.containsKey("three"));
        System.out.println(map.get("four"));
        System.out.println(map.getOrDefault("five", 5));



        System.out.println();




       
        

    }
}
