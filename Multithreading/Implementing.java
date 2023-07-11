                /* By Implementing thread Demo Program */
public class Implementing {
    public static void main(String[] args) 
    {
        Demo_Thread d=new Demo_Thread();
        Thread t=new Thread(d);
        t.start();

        for(int i=1;i<=5;i++)
        {
            System.out.println("Gokul Lade");
        }
    
    }
}
class Demo_Thread implements Runnable{
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println("Gokul");
        }
    }
}

