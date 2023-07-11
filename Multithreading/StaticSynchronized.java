                /*Static Synchronized Method Using Program */
public class StaticSynchronized {
    public static void main(String[] args) 
    {
       Bank b1=new Bank(5000);
       
       Thread t1=new Thread(b1);
       Thread t2=new Thread(b1);

       t1.setName("Gokul");
       t2.setName("Vijay");

       t1.start();
       t2.start();

       Bank b2=new Bank(5000);
       
       Thread t3=new Thread(b2);
       Thread t4=new Thread(b2);

       t3.setName("Aniket");
       t4.setName("Shreyash");

       t3.start();
       t4.start();

    }
    
}
class Bank extends Thread{
   static int bal=5000;
   static int Withdraw;
    Bank(int Withdraw)
    {
        this.Withdraw=Withdraw;
    }
    public static synchronized void Withdraw()
    {
        String name=Thread.currentThread().getName();
        if(Withdraw<=bal)
        {
            System.out.println(name+" withdraw money");
            bal=bal-Withdraw;
        }
        else
        {
            System.out.println("Insufficient balance..!");
        }
    }

    @Override
    public void run()
    {
        Withdraw();
    }
}
