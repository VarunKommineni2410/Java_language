// Anything in java is done by THREADS or at least MAIN THREAD.
// Extend Thread to make that class as thread.
// Thread class is used to class as thread.
//Thread class as inbuilt method RUN() which must have in that extended class
//Thread as functions -> start(),sleep().
//TRICKY TOPIC refer again

class OK extends Thread
{
    public void run() //the class must have run() to use Thread class
    {
        for (int i=0;i<=5;i++)
        {
            System.out.println("OK");
            try{Thread.sleep(1000);} catch (Exception e){} //Handling Exception of Thread.sleep()
        }


    }
}
class OKAY extends Thread
{
    public void run() //the class must have run() to use Thread class
    {
        for (int i=0;i<=5;i++)
        {
            System.out.println("OKAY");
            try{Thread.sleep(1000);} catch (Exception e){} //Handling Exception of Thread.sleep()
        }


    }
}
public class THREADS_class {
    public static void main(String[] args)
    {
        OK t1=new OK();
        OKAY t2=new OKAY();

        //t1.run(); calls the function only so no Thread usage
        //t2.run();  calls the function only so no Thread usage

       // both t1 and t2 calling at a time
        t1.start(); //this will call the run() usage of Thread

        try {Thread.sleep(10);} catch (Exception e){}

        t2.start(); //this will call the run() simultaneously with 10 milliseconds of gap
    }
}
