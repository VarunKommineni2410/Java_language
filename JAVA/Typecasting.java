
// byte -> short -> int -> long -> float -> double    ->it is Widening Casting and reverse is Narrow Casting
//          |
//         char

public class Typecasting {
    public static void main(String[] args) {

        char a=66; //it returns ASCII values

        System.out.println(a);

        //Implicit conversion->big in small which loss of data

        double b=7;
        int c=(int)78.9;
        long d= (int)2739397836L;
        // int e=(long)6776773;  can't cast directly
        System.out.println(d);
    }
}
