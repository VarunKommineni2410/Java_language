import java.util.*;

// Map takes key and value
// Map<K,V>
// keySet(),get(),put()
// HashTable it is Synchronized and HashMap is not ,so only difference is Thread safety
// Refer Hashtable
// TRICKY TOPIC REFER AGAIN

public class Map_INTERFACE {
    public static void main(String[] args) {


        Map<String, Integer> obj = new HashMap<>(); // Map is an interface and Hashset is a class that implements Map

        obj.put("a",1); //put is used not add in Maps
        obj.put("b",2);
        obj.put("c",3);
        obj.put("d",4);

        System.out.println(obj.get("a"));

        //to print Map

        for (String a: obj.keySet()) //keySet() all Key names
        {
            System.out.println(a+":"+obj.get(a));
        }
    }
}
