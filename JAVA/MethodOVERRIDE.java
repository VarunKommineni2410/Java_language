
//@Override -> to make it as a compiled time error
// Method Overriding will take the method or variable from the inherited class if not present in main class

class A_1{

    void dis()
    {
        System.out.println("in A_1");
    }
}
class B_1 extends A_1
{


}
public class MethodOVERRIDE {
    public static void main(String[] args) {

        B_1 obj=new B_1();
        obj.dis();

    }
}
