
//THIS is used if the name of parameters and variables of class are same

class num_0
{
    int num1,num2;
    public void sum(int p, int q)
    {
        num1=p;
        num2=q;

    }
}
class num_1
{
    int num1,num2;
    public void sum(int num1, int num2)
    {
        this.num1=num1;
        this.num2=num2;
    }
}
public class THIS {
    public static void main(String[] args) {

        num_0 ob=new num_0();
        ob.sum(10,20);
        System.out.println("num_0 "+ob.num1+" "+ ob.num2);

        num_1 ob1=new num_1();
        ob1.sum(30,40);
        System.out.println("num_1 "+ob1.num1+" "+ ob1.num2);

    }
}
