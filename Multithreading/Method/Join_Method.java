                /* join() method using program */
public class Join_Method{
    public static void main(String[] args)
    {
        try
        {
            Join_Demo j1=new Join_Demo();
            Join_Demo j2=new Join_Demo();
            Join_Demo j3=new Join_Demo();

            j1.setName("Thread_1");
            j2.setName("Thread_2");
            j3.setName("Thread_3");

            j2.start();
            try
            {
                j2.join();
            }
            catch(InterruptedException e)
            {
                System.out.println(e);
            }
            j1.start();
            j3.start();
        }
        catch(IllegalThreadStateException e)
        {
            System.out.println(e);
        }
    }

}

class Join_Demo extends Thread {
   
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

