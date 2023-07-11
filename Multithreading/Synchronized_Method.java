                /*Synchronized method using Demo Program  */
public class Synchronized_Method {
    public static void main(String[] args)
    {
        Table ta=new Table();
        
        Thread_1 t1=new Thread_1(ta);
        Thread_2 t2=new Thread_2(ta);

        t1.start();
        t2.start();
        
        
    }
    
}
class Table{
    public synchronized void Table_1(int n)
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println(n*i);
        }
    }
}
class Thread_1 extends Thread{
    Table t;
    Thread_1(Table t)
    {
        this.t=t;
    }
    public void run()
    {
        t.Table_1(5);
    }
}
class Thread_2 extends Thread{
    Table t;
    Thread_2(Table t)
    {
        this.t=t;
    }
    public void run()
    {
        t.Table_1(10);
    }
}
