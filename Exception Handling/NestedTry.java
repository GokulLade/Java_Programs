                /*Nested Try block Demo Program */
public class NestedTry {
    public static void main(String args[])
    {
        try
        {
            try
            {
                System.out.println(10/0);
            }
            catch(ArithmeticException ae)
            {
                System.out.println("Arithmetic Exception ");
            }
            int a[]={10,20,30,40};
            System.out.println(a[5]);
        }
        catch(ArrayIndexOutOfBoundsException ar)
        {
            System.out.println("Array Out of Bound Exception ");
        }
        System.out.println("Main Method End");
    }
    
}
