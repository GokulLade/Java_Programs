                /*try-catch block inside Finally block */
public class NestedFinally {
    
    public static void main(String args[])
    {
        try
        {
            System.out.println(10/0);
        }
        catch(Exception e)
        {
            System.out.println("Arithmetic Exception");
        }
        finally
        {
            try
            {
                int a[]={11,22,33,44};
                System.out.println(a[4]);
            }
            catch(ArrayIndexOutOfBoundsException ar)
            {
                System.out.println("Array Index out of Bound Exception");
            }
            finally
            {
                System.out.println("End of Finally BLock");
            }
        }
        System.out.println("End of Main Method");
    }
}
    

