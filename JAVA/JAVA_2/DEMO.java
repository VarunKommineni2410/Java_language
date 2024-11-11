//Quadratic Equation Roots

package JAVA_2;
import java.util.*;
import java.lang.Math;

public class DEMO {
    public static void main(String[] args) {

        Scanner inp=new Scanner(System.in);
        System.out.println("Enter a,b,c: ");
        int a,b,c;
        double d,r1,r2;
        a= inp.nextInt();
        b= inp.nextInt();
        c= inp.nextInt();

        d=(b*b)-(4*a*c);
        r1=((-b)+Math.sqrt((b*b)-4*a*c))/(2*a);
        r2=((-b)-Math.sqrt((b*b)-4*a*c))/(2*a);

        if(d==0)
            System.out.println("Equal roots are: "+r1);
        else if(d>0)
            System.out.println("Real and distinct roots are: "+r1+" and "+r2);
        else if(d<0)
            System.out.println("Imaginary roots");

    }
}