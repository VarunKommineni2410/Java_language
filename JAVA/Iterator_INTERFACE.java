import java.util.*;

//collections are advanced way of data structures with additional features
//but still ARRAYS,STRINGS are faster so prefer them above collections
// Collection is an interface
// COLLECTIONS AND GENERICS refer again complex topic

public class Iterator_INTERFACE {
    public static void main(String[] args) {

        Collection obj=new ArrayList(); //Collection is an interface and Arraylist is a class that implements Collection

        obj.add(1); //collection doesn't have index values so, we use iterator interface
        obj.add(2); // it is not int 2. It is Integer 2 (Wrapper class)
        obj.add("A"); // obj.add(object o)

        System.out.println(obj); //prints total values in obj

        //to print one by one we use Iterator

        Iterator it=obj.iterator(); //here Iterator is interface and iterator is a method

        //use next()
        //System.out.println(it.next());
       // System.out.println(it.next());
       // System.out.println(it.next());
       // System.out.println(it.next()); error because out of bound

        //using while loop
        System.out.println("With while loop: ");

        while (it.hasNext())
        {
            System.out.println(it.next());

        }

    }
}
