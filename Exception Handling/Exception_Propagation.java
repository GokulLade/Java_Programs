                /*Exception Propagation Demo Program */
public class Exception_Propagation {
    public static void main(String[] args)
    {
        try
        {
            show1();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        System.out.println("Main Method end");
                
        
    }
    public static void show1()
    {
        show2();
    }
    public static void show2()
    {
        System.out.println(10/0);
       
    }
}
