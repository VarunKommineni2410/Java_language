// synchronized will let access the method one thread at a time.
//TRICKY refer again

class Counter
{
    int c;
    public synchronized void increment()
    {
        c++;
    }
}
public class Synchronized_KEYWORD {
    public static void main(String[] args) throws Exception
    {

        Counter obj=new Counter();

        Thread t1=new Thread(   () ->
        {
          for(int i=0;i<1000;i++)
          {
              obj.increment();
          }
        }
        );


        Thread t2=new Thread(  () ->
        {
            for(int i=0;i<1000;i++)
            {
                obj.increment();
            }
        }
        );


        t1.start();
        t2.start();

        //without synchronized method both will access threads will collide and output differs

        t1.join();
        t2.join();

        System.out.println("c is "+obj.c);


    }
}
