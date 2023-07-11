                /*stop() method using Demo Program */
public class Stop_Method {
    public static void main(String[] args)
    {
        Stop_Demo sd1=new Stop_Demo();
        Stop_Demo sd2=new Stop_Demo();
        Stop_Demo sd3=new Stop_Demo();

        sd1.setName("Thread_1");
        sd2.setName("Thread_2");
        sd3.setName("Thread_3");

        sd1.start();
        sd2.start();
        sd3.start();

        sd1.stop();           

    }
    
}
class Stop_Demo extends Thread{
    @Override
    public void run()
    {
        String str=Thread.currentThread().getName();
        for(int i=1;i<=3;i++)
        {
            System.out.println(str);
        }
    }
}
