                /* Multithreading Problem and solution Demo Program */
public class Problems_Multithreading {
    public static void main(String[] args) 
    {
        Bus b=new Bus(1);

        Thread t1=new Thread(b);
        Thread t2=new Thread(b);
        Thread t3=new Thread(b);

        t1.setName("Ram");
        t2.setName("Sham");
        t3.setName("Om");

        t1.start();
        t2.start();
        t3.start();


    }
    
}
class Bus implements Runnable{
    int avl=1,psg;
    Bus(int psg)
    {
        this.psg=psg;
    }
    @Override
    public synchronized void run()              
    {
        String name=Thread.currentThread().getName();
        if(avl>=psg)
        {
            System.out.println(name+" Reversed Seat....!");
            avl=avl-psg;
        }
        else
        {
            System.out.println("Sorry Seat not Available....!");
        }
    }
}
