// It is same as Scanner But advanced
// Be careful with Buffer related Spellings
// It reads Strings
//it as functions readLine,read,marks etc.

import java.io.*;

public class Buffer_Reader {
    public static void main(String[] args) throws IOException {

        InputStreamReader in=new InputStreamReader(System.in); // first create object of inputStream

        BufferedReader r=new BufferedReader(in); // use the object of inputStream

        System.out.println("Enter a Integer: ");
        int a =Integer.parseInt(r.readLine()); // using parseInt(static method) from Integer class

        System.out.println(a);
    }
}
