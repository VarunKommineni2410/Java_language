public class Conditional {
    public static void main(String[] args) {

        //if-else  //Use BREAK,CONTINUE if needed

        int a = 9;

        if (a % 2 == 0) {
            System.out.println("2 mul");
        }

        else if (a % 3 == 0) {
            System.out.println("3 mul");
        }

        else if (a % 4 == 0) {
            System.out.println("4 mul");
        }

        else {
            System.out.println("None");
        }

    //Ternary operator

    //can also use CHAR,STRING but not DOUBLE
    //use BREAK to go out of switch

    int m=9;
    String n=m==9?"yes":"no";
        System.out.println(n);

    //switch statement

    int k=3;

    switch (k){
        case 1:{
            System.out.println("1");
            break;
        }
        case 2:{
            System.out.println("2");
            break;
        }
        case 3:{
            System.out.println("3");
            break;
        }
        case 4:{
            System.out.println("4");
            break;
        }
        default:{
            System.out.println("None");
        }

    }

    }
}