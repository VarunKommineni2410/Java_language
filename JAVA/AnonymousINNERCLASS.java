// Anonymous inner class used in place is single time usage classes
// normally we create object for calling of methods in classes.
// But in Anonymous we create class method after creating of object

class P
{
    public void show()
    {
        System.out.println("in P");
    }


}
class AnonymousINNERCLASS {
    public static void main(String[] args) {

        P obj=new P()
                {
                    public void show()  //this class as no name so, it is called Anonymous class
                                        // it OVERRIDES show() in above P class
                    {
                    System.out.println("In P main class");
                    }

                    //public void dis(){}  this can't be accessed because it is not in class P

                };

        obj.show(); //calls Inner show()

        //obj.dis(); this method not in class P show can't be OVERRIDDEN
    }
}