//Runnable interface is same as Thread class , it is used to extend multiple classes
//Runnable as only one method -> run()
//Runnable as don't have any functions -> sleep(),start() etc.
//TRICKY topic refer again linked with THREAD class

class ooo implements Runnable
{
    public void run() //the class must have run() to use Runnable interface
    {
        for (int i=0;i<=5;i++)
        {
            System.out.println("HI");
            try{Thread.sleep(1000);} catch (Exception e){} //Handling Exception of Thread.sleep()
        }


    }
}
class ppp implements Runnable
{
    public void run() //the class must have run() to use Runnable interface
    {
        for (int i=0;i<=5;i++)
        {
            System.out.println("HELLO");
            try{Thread.sleep(1000);} catch (Exception e){} //Handling Exception of Thread.sleep()
        }


    }
}
public class Runnable_INTERFACE
{
    public static void main(String[] args)
    {
        //TRICKY while using interface

        ooo obj1=new ooo(); // we can also use runnable as the reference
        ppp obj2=new ppp();

        //obj.start() do not work because there is no function start in runnable so use THREAD object

        Thread t1=new Thread(obj1); //here keep Thread(Runnable object) to join obj1 to t1.
        Thread t2=new Thread(obj2); //here keep Thread(Runnable object) to join obj2 to t2.

        //Now we can use start() in Runnable interface
        t1.start(); //this will call the run() in Runnable.
        try {Thread.sleep(10);} catch (Exception e){}
        t2.start(); //this will call the run() in Runnable.simultaneously with 10 milliseconds of gap
    }
}
