//types of inheritance
//1.single level
//2.multilevel
//3.hierarchical

//multiple and hybrid are not supported in JAVA but INTERFACES are used to achieve
//EXTENDS keyword is used to get inheritance

//IS-A ->the class which inherits other classes. ex= class B and class C.
//HAS-A ->the class which has the objects of the classes. ex= public class inheritance.

class A
{
    public void showA()
    {
        System.out.println("A");
    }
}

class B extends A       //A and B, B and C single level
{
    public void showB()
    {
        System.out.println("B");
    }
}

class C extends B         //A,B,C are multilevel
{
    public void showC()
    {
        System.out.println("C");
    }
}

public class Inheritance {
    public static void main(String[] args) {

        C obj=new C();
        obj.showC();
        obj.showB();
        obj.showA();

    }
}
