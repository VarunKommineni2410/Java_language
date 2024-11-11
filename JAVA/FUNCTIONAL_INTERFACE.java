
//LAMBDA exp is decrease code length, and it is only possible for SINGLE or FUNCTIONAL interface

interface One
{
  void dis();
}

public class FUNCTIONAL_INTERFACE
{
    public static void main(String[] args) {

        One obj=() ->System.out.println("HELLO"); //TRICKY syntax refer again

        obj.dis();

    }
}