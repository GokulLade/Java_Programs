                /*Thread Scheduler Demo Program */
public class Thread_Scheduler {
    public static void main(String[] args) 
    {
        Thread_Demo t1=new Thread_Demo();
        Thread_Demo t2=new Thread_Demo();
        Thread_Demo t3=new Thread_Demo();

        t1.setName("Thread_1");
        t2.setName("Thread_2");
        t3.setName("Thread_3");

        t1.start();
        t2.start();
        t3.start();

        for(int i=1;i<=5;i++)
        {
            System.out.println("Main Method");
        }

    }
    
}
class Thread_Demo extends Thread{
    public void run()
    {
        String str=Thread.currentThread().getName();
        for(int i=1;i<=5;i++)
        {
            System.out.println(str);
        }
    }
}
