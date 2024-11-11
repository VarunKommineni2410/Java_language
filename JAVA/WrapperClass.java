import java.lang.*;

//primitive datatype is faster than WrapperClass.But we use WrapperClass for diff frameworks

//Refer again through internet tricky topic

//Primitive Type	Wrapper class
//  boolean	   ->      Boolean
//  char	   ->      Character
//  byte	   ->      Byte
//  short	   ->      Short
//  int	       ->      Integer
//  long	   ->      Long
//  float	   ->      Float
//  double	   ->      Double

public class WrapperClass {
    public static void main(String[] args)
    {
        int a=4; //primitive datatype

        Integer obj=new Integer(a); //Boxing or Wrapping ->keeping primitive variable in class

        int b=obj.intValue(); //unBoxing or unWrapping ->using the Wrapped object

        Integer p=a;  //auto Boxing

        int value=p;  //auto unBoxing
    }
}
