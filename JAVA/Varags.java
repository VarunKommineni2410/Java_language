//it allows taking multiple parameters and uses FOREACH to function them
// Varargs -> variable arguments
class ADD{

    void main(int...n)
    {   int sum=0;

        for(int i:n)
        {
            sum+=i;
        }
        System.out.println("sum is "+sum);
    }
}
public class Varags {
    public static void main(String[] args) {

        ADD obj=new ADD();
        obj.main(1,5,6,3,90,1);
    }
}
