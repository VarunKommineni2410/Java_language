public class Arithmetic {
    public static void main(String[] args) {
        int a=8,b=5,res;
        res=a+b;
        res=a-b;
        res=a*b;
        res=a/b;
        res=a%b;

        double res_1=(double)a/b; //typecast to get decimal values

        System.out.println(res_1);

        //increment operator

        int m=5;

        System.out.println(++m);  //prints directly the incremented value
        System.out.println(m);
        System.out.println(m++);  //prints same value but after printing m again it will be incremented one
        System.out.println(m);
    }
}
