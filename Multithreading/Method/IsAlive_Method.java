                /* isAlive method using Program */
public class IsAlive_Method {
    public static void main(String[] args) 
    {
        IsAlive_Demo id1=new IsAlive_Demo();
        IsAlive_Demo id2=new IsAlive_Demo();

        System.out.println(id1.isAlive());
        id1.start();
        System.out.println(id1.isAlive());

        System.out.println(id2.isAlive());
        id2.start();
        System.out.println(id2.isAlive());
       
    }
    
}
class IsAlive_Demo extends Thread{
    @Override
    public void run()
    {
        System.out.println("IsALive Demo Program");
    }
}