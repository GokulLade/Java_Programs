                /*finalize Method using Demo Program */
public class Finalize {
    public static void main(String[] args) 
    {
        Cricketer c=new Cricketer();
        c=null;
        System.gc();
        
    }
    
}
class Cricketer extends Object{
    Cricketer()
    {
        System.out.println("Object is Created");
    }
    protected void finalize()
    {
        System.out.println("Object is Destroyed");
    }
}
