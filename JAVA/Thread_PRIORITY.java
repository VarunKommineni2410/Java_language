// see join(),setName(),getName(),isAlive() etc.
// see getPriority() -> range is 1 to 10, were 1 is lowest, 10 is highest and 5 is normal and default.
// MIN_PRIORITY -> 1
// MAX_PRIORITY -> 10
// NORM_PRIORITY -> 5
//Thread.currentTHREAD()

public class Thread_PRIORITY {
    public static void main(String[] args) throws InterruptedException {

        Thread t1=new Thread(  () -> //Runnable object(obj1) Anonymous interface directly here

        {
            for (int i=0;i<=5;i++)
            {
                System.out.println("HI "+Thread.currentThread().getPriority());
                try{Thread.sleep(1000);} catch (Exception ignored){} //Handling Exception of Thread.sleep()
            }
        }

        , "HI thread");

        Thread t2=new Thread(  () -> ////Runnable object(obj2) Anonymous interface directly here

        {
            for (int i=0;i<=5;i++)
            {
                System.out.println("HELLO "+Thread.currentThread().getPriority());
                try{Thread.sleep(1000);} catch (Exception ignored){} //Handling Exception of Thread.sleep()
            }
        }

        ,"HEllO thread");

        // we can also use t1.setName() to set the name

        System.out.println(t1.getName());
        System.out.println(t2.getName());


        // getting priority

        System.out.println(t1.getPriority());  // 5 is default
        System.out.println(t2.getPriority());

        // setting priority

        t1.setPriority(1);
        t1.setPriority(10);


        t1.start();
        try {Thread.sleep(10);} catch (Exception ignored){}
        t2.start();

        //use "Throws Exception" to handle error
        t1.join();  //it indicates completion of t1
        t2.join();  //it indicates completion of t2

        //checking t1 and t2 life
        System.out.println(t1.isAlive());
        System.out.println(t2.isAlive());

        System.out.println("BYE"); //to this after completion of both t1.join(),t2.join().

    }
}
