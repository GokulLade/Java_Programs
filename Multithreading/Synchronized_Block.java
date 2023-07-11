                /*Using Synchronized block Demo Program */
public class Synchronized_Block {
    public static void main(String[] args) 
    {
        Print p1=new Print();
        
        Block_Demo d1=new Block_Demo(p1, "Gokul");
        Block_Demo d2=new Block_Demo(p1, "Lade");

        d1.start();
        d2.start();
    }
    
}
class Print{
    public void show(String name)
    {


        synchronized(this)
        {
            for(int i=1;i<=3;i++)
            {
                System.out.println(name);
            }
        }


    }
}
class Block_Demo extends Thread{
    Print p;
    String name;
    Block_Demo(Print p, String name)
    {
        this.p=p;
        this.name=name;
    }
    public void run()
    {
        p.show(name);
    }
}
