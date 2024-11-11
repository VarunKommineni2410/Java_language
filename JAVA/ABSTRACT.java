
//ABSTRACT class cannot have object.But can be extended
//it allows to have only reference of the methods not the details

//Refer again for better understanding

abstract class Human {

    abstract void eat(); //abstract method
    public void talk(){

    }

}
class Man extends Human{
    public void eat() //it must have eat() method because it's super class has abstract method eat()
    {

    }
    public void walk(){

    }


}
public class ABSTRACT {
    public static void main(String[] args) {

    }
}

