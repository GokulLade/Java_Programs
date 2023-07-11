                /* sleep() method using program */
public class Sleep_Method{
    public static void main(String[] args)throws InterruptedException
    {
        try
        {
            Sleep_Demo s1=new Sleep_Demo();
            Sleep_Demo s2=new Sleep_Demo();
            Sleep_Demo s3=new Sleep_Demo();

            s1.setName("Thread_1");
            s2.setName("Thread_2");
            s3.setName("Thread_3");

            s1.start();
            s2.start();
            s3.start();
        }
        catch(IllegalThreadStateException e)
        {
            System.out.println(e);
        }
    }

}

class Sleep_Demo extends Thread {
   
    @Override
    public void run() 
    {
        try
        {
        
                String str=Thread.currentThread().getName();
                
                for(int i=1;i<=5;i++)
                {
                    System.out.println(str);
                    Thread.sleep(3000);             // Thread class static method sleep define
                }
        }
                
        catch (InterruptedException i) 
        {
            System.out.println("handled  exception...");
        }
    }
}