
/*  if we don't need a variable to be object specific we can use STATIC method.
    it will make it same for all objects.  */

//Static variable

class Emp{
    int id,salary;
    static String ceo; // will be same for all objects

    void det()
    {
        System.out.println(id+":"+salary+":"+ceo);
    }
}
public class StaticVAR {
    public static void main(String[] args) {

        Emp one=new Emp();
        one.id=1;
        one.salary=5000;
        //one.ceo="Gates"; this doesn't need
        //one.det();  if called here doesn't have effect

        Emp two=new Emp();
        two.id=2;
        two.salary=8000;
        Emp.ceo ="Musk"; //for STATIC variable or method use classname as reference

        one.det(); //calling here will ceo same for both one and two
        two.det();

    }
}
