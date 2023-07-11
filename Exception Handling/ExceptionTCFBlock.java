                /*Try Catch Finally block using Demo program */
public class ExceptionTCFBlock {
    public static void main(String[] args)
    {
        System.out.println("Start main Method");
        try
        {
            int a=20,b=0,c;
            c=a/b;
            System.out.println("The Division is= "+c);

        }
        catch(Exception e)
        {
            System.out.println("Not Divided by 0");
        }
        finally                                     //Always execute
        {
            System.out.println("Finally Block");
        }
        System.out.println("End main Method");
        
    }
    
}
