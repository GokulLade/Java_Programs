                /* interrupt() method using program */
public class Interrupt_Method {
    public static void main(String[] args) 
    {
        Interrupt_Demo id=new Interrupt_Demo();
        id.start();

        id.interrupt();

        
        
    }
    
}
class Interrupt_Demo extends Thread{
    @Override
    public void run()
    {
        try
        {
            for(int i=1;i<=5;i++)
            {
                System.out.println("Interrupt Demo Program");
                Thread.sleep(1000);
            }   
        }
       catch(InterruptedException i)
       {
            System.out.println("Exception Handled....!");
       }
    }
}
