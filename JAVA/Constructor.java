
//Constructor don't return anything
//it should have same named as class name

class Bike{
    public Bike()
    {
        System.out.println("Splender");
    }
    public void price(int pri)
    {
        System.out.println("Price: "+pri);
    }

}

public class Constructor {
    public static void main(String[] args) {

        Bike obj=new Bike(); //Constructor called directly after object creation

    }
}
