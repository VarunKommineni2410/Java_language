
// With STATIC methods in INTERFACE we can directly call method without object
// When we create variable inside INTERFACE it is final by default

interface Hi
{
    int num=9; //FINAL by default so constant

    void show();
    static void dis()  //declared using static keyword
    {
        System.out.println("HI");
    }
}

public class Static_METHOD_INTERFACE {
    public static void main(String[] args) {

        Hi.dis(); //can be called like this only if it's STATIC method
    }
}
