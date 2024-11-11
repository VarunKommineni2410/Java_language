import java.util.*;

//import above for SCANNER class

//   Method	                     Description
// nextBoolean()	->     Reads a boolean value from the user
// nextByte()	    ->     Reads a byte value from the user
// nextDouble()	    ->     Reads a double value from the user
// nextFloat()	    ->     Reads a float value from the user
// nextInt()	    ->     Reads an int value from the user
// nextLine()	    ->     Reads a String value from the user
// nextLong()	    ->     Reads a long value from the user
// nextShort()	    ->     Reads a short value from the user

public class INPUT {
    public static void main(String[] args) {

        Scanner inp=new Scanner(System.in);

        int a;
        System.out.print("Enter: ");

        a= inp.nextInt(); //others in above comment

        System.out.println("You chose: "+a);


    }
}
