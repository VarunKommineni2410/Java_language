//lambda expression is used to reduce the number of lines of code only.
// lambda exp can be used for functional interface only
// getting previous(HI HELLO ex) by Lambda EXP.
//TRICKY syntax refer again
// observe catch(Exception ignored)

public class LAMBDA_EXP {
    public static void main(String[] args)
    {
        Thread t1=new Thread(  () -> //Runnable object(obj1) Anonymous interface directly here

        {
            for (int i=0;i<=5;i++)
            {
                System.out.println("HI");
                try{Thread.sleep(1000);} catch (Exception ignored){} //Handling Exception of Thread.sleep()
            }
        }

        );

        Thread t2=new Thread(  () -> ////Runnable object(obj2) Anonymous interface directly here

        {
            for (int i=0;i<=5;i++)
            {
                System.out.println("HELLO");
                try{Thread.sleep(1000);} catch (Exception ignored){} //Handling Exception of Thread.sleep()
            }
        }

        );


        t1.start();
        try {Thread.sleep(10);} catch (Exception ignored){}
        t2.start();

    }
}
