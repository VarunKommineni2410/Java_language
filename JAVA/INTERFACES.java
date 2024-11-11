/* The diff b/w ABSTRACT class and INTERFACES
   is in ABSTRACT we can have abstract methods and normals methods.But
   in INTERFACES only abstract methods and normal methods with only declaration not definition*/

//we can implement multiply INTERFACES to a class
//we can create reference but not object to a INTERFACE

interface NUM
{
    void show();

}

class implementor implements NUM
{
     public void show() {System.out.println("In Implementor");}
}

public class INTERFACES {
    public static void main(String[] args)
    {


        NUM obj=new implementor(); //ref of NUM object of implementor
        obj.show();

    }
}
