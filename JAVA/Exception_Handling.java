
//It is used to handle errors manually by Try,Catch & Finally.
//also refer multiple catches and many other topics like THROWS,TRY Resources,Checked Exception and Unchecked Exception etc.
//there are many other exception -> Null_point_exception etc.
//We can also create user defined exception
//refer get.message()

class O_N_E extends Exception
{

}

public class Exception_Handling {
    public static void main(String[] args)
    {
        try
        {   int[] a =new int[2];
            a[0]=67;
            a[1]=89;
            a[2]=32;

            int i=8;
            int j=8;
            int k=i/j;

            System.out.println("k is "+k);

            if (k==1)
                throw new O_N_E(); //Creating user defined exception by creating it as a ONE class and extending EXCEPTION
        }

        catch (ArrayIndexOutOfBoundsException | ArithmeticException e)  //for multiple catches use "|"
                                                                        // and single object e or anything
        {
            System.out.println("Error Arithmetic or Array"); //first priority
        }

        catch (O_N_E obj) //user defined Exception
        {
            System.out.println("ONE error");
        }

        catch (Exception e) //Exception is in-built class and e or anything can be its object.Keep it always in last catch
        {
            System.err.println("Error");  //err to print in red colour
                                          // second priority
        }

        finally
        {
            assert System.out != null; // refer it TRICKY topic
            System.out.println("End");
        }
    }
}
