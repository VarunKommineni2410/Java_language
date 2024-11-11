// here we interface can't have object
// but the anonymous class will create a separate class. so we can create an object to that interface
//refer again TRICKY topic

//Types of Interfaces
//1.Normal -> multiple methods
//2.Single ->one method ->FUNCTIONAL INTERFACE
//3.Marker -> no methods

interface ABC
{
    void show();

}


public class AnonymousINNER_INTERFACES {
    public static void main(String[] args) {

        ABC obj=new ABC()
                    {
                        public void show()
                            {
                                System.out.println("In new show");
                            }
                    };

        obj.show();
    }
}
