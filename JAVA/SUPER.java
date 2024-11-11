
//one method can have only one SUPER().
// SUPER() should be the first line of the method block
// to inherit method -> super.method_name()

class A_0
{
    public A_0()
    {
        System.out.println("in A_0");
    }
    public A_0(int i)
    {
        System.out.println("in A_0 int");
    }

}

class B_0 extends A_0  //default there is a super() in the class it access the parent class constructor directly
{
    public B_0()
    {
        //super(69)  ->if want to access A_0(int i) with method B_0()

        System.out.println("in B_0");
    }
    public B_0(int i)
    {
        super(i);// it comes in place of super()

        System.out.println("in B_0 int");
    }
}

public class SUPER
{
    public static void main(String[] args)
    {

        B_0 obj=new B_0();     //calls A_0() and B_0() without SUPER(i).
        B_0 obj1=new B_0(9);     //calls A_0() and B_0(int i) without SUPER(i).

    }
}
