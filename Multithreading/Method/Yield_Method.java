                /* yield() method using program */
public class Yield_Method {
    public static void main(String[] args) 
    {
        Thread_1 t1=new Thread_1();
        Thread_2 t2=new Thread_2();
        
        t1.start();
        t2.start();
    }
    
}
class Thread_1 extends Thread{
    @Override
    public void run()
    {
        String str=Thread.currentThread().getName();
        for(int i=1;i<=3;i++)
        {
            System.out.println(str);
            Thread.yield();
        }
    } 
}
class Thread_2 extends Thread{
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