//Palindrome

package JAVA_2;
import java.util.Scanner;

public class DEMO_3 {
    public static void main(String[] args) {

        String n;
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter String term: ");
        n = inp.next();

        int l = n.length();
        String c="";

        for (int i = l - 1; i >= 0; i--) {

            System.out.print(n.charAt(i) + " ");
            c=c+n.charAt(i);

        }
        System.out.println();
        if(c.equals(n))
           System.out.println("palindrome");
       else
           System.out.println("Not palindrome");


    }
}
