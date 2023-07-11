                /* By extending thread class demo program */
class ThreadDemo extends Thread{
    @Override
    public void run()
    {
       
        for(int i=1;i<=5;i++)
        {
            System.out.println("Gokul");
           
        }
        
    }
}

class Extending{
    public static void main(String[] args) 
    {
        ThreadDemo t=new ThreadDemo();
        t.run();

        for(int i=1;i<=5;i++)
        {
            System.out.println("Gokul Lade");
           
        }
    }
}
