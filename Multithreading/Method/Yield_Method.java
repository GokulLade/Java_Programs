                /* yield() method using program */
public class Yield_Method {
    public static void main(String[] args) 
    {
        Thread1 t1=new Thread1();
        Thread2 t2=new Thread2();
        
        t1.start();
        t2.start();
    }
    
}
class Thread1 extends Thread{
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
class Thread2 extends Thread{
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