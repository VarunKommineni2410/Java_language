public class Variables {
    public static void main(String[] args) {

        int a=19;      //once the datatype is declared we can modify just by variable name

            a = 8;     // again (int a=8) will give error

        System.out.println(a);

        long b=50_00_00_00; // underscore can or cannot be used
        double c=67.8;
        short d =98;
        float e=78.90f;     //use the f in float
        char f='A';         // f='ABC' will give error only one character is valid not multiple
        boolean g= false;   //takes only false or true values only
        byte h= 127;        //takes only values in b/w -128 to 127

        System.out.println(f);
    }
}
