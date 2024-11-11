
//Same as METHOD OVERLOAD but using CONSTRUCTORS

class Cal1{
    public Cal1(int i ,int j)   //CONST_1 with 2 parameters
    {
        System.out.println("sum is "+(i+j));
    }
    public Cal1(int i ,int j,int k)  //CONST_2 with 3 parameters
    {
        System.out.println("sum is "+(i+j+k));
    }
    public Cal1(double i ,double j)  //CONST_3 with 2 DOUBLE parameters
    {
        System.out.println("sum is "+(i+j));
    }
}

public class ConstructorOVERLOAD {
    public static void main(String[] args) {

        Cal1 obj=new Cal1(5,6);
        Cal1 obj1=new Cal1(8,9,5);
        Cal1 obj2=new Cal1(6.2,5.3);


    }
}
