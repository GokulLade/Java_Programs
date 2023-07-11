                /* suspen() method using program */
public class Suspend {
    public static void main(String[] args)
    {
       Suspend_Demo sp1=new Suspend_Demo();
       Suspend_Demo sp2=new Suspend_Demo();
       Suspend_Demo sp3=new Suspend_Demo();

        sp1.setName("Thread_1");
        sp2.setName("Thread_2");
        sp3.setName("Thread_3");

        sp2.start();
        try
        {
            sp2.suspend();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        sp1.start();
        sp3.start();
        sp2.resume();

    }
}
class Suspend_Demo extends Thread{
    @Override
    public void run()
    {
        String str=Thread.currentThread().getName();
        for (int i=1;i<=3;i++)
        {
            System.out.println(str);
        }
    }
}
