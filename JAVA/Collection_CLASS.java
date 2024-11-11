import java.util.*;

//Collections class as many inbuilt functions -> sort,reverse etc
// refer COMPARATOR and COMPARABLE Interface TRICKY TOPIC
//refer again

public class Collection_CLASS {
    public static void main(String[] args) {


        List<Integer> obj=new ArrayList<>(); // List is an interface and Arraylist is a class that implements List

        obj.add(1);
        obj.add(84);
        obj.add(67);
        obj.add(4);

        //to sort
        Collections.sort(obj);
        // to reverse
        Collections.reverse(obj);
        // to shuffle
        Collections.shuffle(obj);

        for (Object o:obj) // add(object e)
        {
            System.out.println(o);
        }
    }
}
