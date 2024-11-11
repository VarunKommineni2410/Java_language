//creating class inside class

//member class ->inner class with non-static keyword example below
//static class ->inner class with static keyword
class Outer{
    public void display()
    {
        System.out.println("In Outer");
    }
    class Inner     //Outer$Inner    //if class static Inner then refer below
    {
      public void display()
      {
          System.out.println("In Inner");
      }
    }

}
public class InnerClass {
    public static void main(String[] args) {

        Outer obj=new Outer(); // normal object
        obj.display();

        Outer.Inner obj1=obj.new Inner(); //to create obj1 of Inner create obj of outer and use obj.new Inner()
        obj1.display();                   // also use Outer.Inner as reference

        //Outer.Inner obj2=new Outer.Inner() // if we name INNER class as static no need of obj to create obj2
    }
}
