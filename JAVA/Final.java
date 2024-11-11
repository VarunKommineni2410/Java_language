
//FINAL variables can only be modified in constructor of that class
//FINAL class -> can't be extended.
//FINAL method -> can't be overridden
//FINAL variable -> it's constant
//refer examples

class one
{
    final int A=8; //constant cannot be change
    final int B;

    one()
    {
        //A=22; //A is using FINAL keyword

        B=40; //can't change after fist assigning of data to B

        //B=67; //error can't change
    }
}

public class Final {
    public static void main(String[] args) {

        one obj= new one();
        System.out.println(obj.B);

    }
}
