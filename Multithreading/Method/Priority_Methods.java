                /* setPriority() & getPriority method using Program */
public class Priority_Methods {
    public static void main(String[] args)
    {
        Priority_Demo pd1=new Priority_Demo();
        Priority_Demo pd2=new Priority_Demo();
        Priority_Demo pd3=new Priority_Demo();

        pd1.setName("Thread_1");
        pd2.setName("Thread_2");
        pd3.setName("Thread_3");

        pd1.start();
        pd2.start();
        pd3.start();

        pd1.setPriority(4);
        pd2.setPriority(3);
        pd3.setPriority(7);
        
        
    }
    
}
class Priority_Demo extends Thread{
    @Override
    public void run()
    {
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());
    }
}
