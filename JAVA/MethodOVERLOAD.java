// Same method but different type or number of parameters
// METHOD OVERLOADING doesn't need inheritance

class Cal{
    public void add(int i ,int j)   //same method name but diff parameters
    {
        System.out.println("sum is "+(i+j));
    }
    public void add(int i ,int j,int k)
    {
        System.out.println("sum is "+(i+j+k));
    }
    public void add(double i ,double j)
    {
        System.out.println("sum is "+(i+j));
    }
}
public class MethodOVERLOAD {
    public static void main(String[] args) {

        Cal obj=new Cal();
        obj.add(1,3);          // 2 parameters
        obj.add(1,5,9);     // 3 parameters
        obj.add(3.7,9.6);     // DOUBLE parameters
    }
}
