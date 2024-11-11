
class Add{
    int a,b,res;
    public void SUM()
    {
        res=a+b;     //can't assign outside class cause outside class variables are declared and defined in method
    }
}

public class OOPS {
    public static void main(String[] args) {

        Add obj=new Add();
        obj.a=1;
        obj.b=3;
        obj.SUM();
        System.out.println(obj.res);

    }
}
