import java.util.ArrayList;
import java.util.List;

//Generic allows to specify single data type entry.
//Take homogenous datatype.
// <Integer> or <int>,<String> etc

public class Generics_LIST {
    public static void main(String[] args) {

        List<Integer> obj=new ArrayList<>(); // <Integer> is a generic

        obj.add(1);
        obj.add(8);
        // obj.add("A"); with generics <> only integer is taken
        obj.add(67);

        for (Object o:obj) // add(object e)
        {
            System.out.println(o);
        }
    }
}
