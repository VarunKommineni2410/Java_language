
// Abstract class-> define and declare Methods
// Interface -> define, But in 1.8 we can also define Methods
// So there is not much diff b/w Abstract and Interfaces

// DEFAULT can be used to define a method in INTERFACE
// Default methods are methods that can have a body
//DEFAULT methods supports METHOD OVERRIDING

interface EX
{
    void show(); //even though there are 2 methods it is FUNCTIONAL interface because it as only one abstract class

    default void dis() //default keyword lets define method in interface
    {
        System.out.println("In display");
    }
}

class Demo implements EX
{
    public void show()
    {
        System.out.println("In show of Demo");
    }
    public void dis() { System.out.println("In display of demo");}
}

public class Default_METHOD_INTERFACE {
    public static void main(String[] args) {

        EX obj=new Demo();
        obj.show();
        obj.dis();

    }
}
