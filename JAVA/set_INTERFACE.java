import java.util.*;

//set doesn't take duplicate elements, it is same as list interface

public class set_INTERFACE {
    public static void main(String[] args) {

        Set<Integer> obj=new HashSet<>(); // Set is an interface and Hashset is a class that implements Set

        obj.add(1);
        obj.add(8);
        obj.add(6);
       // obj.add(6); //6 gets print only one time

        for (Object k:obj)
        {
            System.out.println(k); //Hashset prints randomly or not in a sequence.For sequence, we can use TreeSet.
        }

    }
}
