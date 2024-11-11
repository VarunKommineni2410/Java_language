import java.util.*;

//using list we can add element in between with index number

public class List_INTERFACE {
    public static void main(String[] args) {

        List obj=new ArrayList(); // List is an interface and Arraylist is a class that implements List

        obj.add(1);
        obj.add(8);
        obj.add("A");

        //using List interface we can add element in b/w
        obj.add(1,4);

        System.out.println(obj);

        //printing using for loop

        for (int i=0;i<obj.size();i++)
        {
            System.out.println(obj.get(i));
        }
    }
}
