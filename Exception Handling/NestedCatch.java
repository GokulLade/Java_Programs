                /*try-catch inside catch block Demo Program */
public class NestedCatch {
    public static void main(String args[])
    {
        try
        {
            System.out.println(10/0);
        }
        catch(Exception e)
        {
            try
            {
                int a[]={11,22,33,44};
                System.out.println(a[3]);
            }
            catch(ArrayIndexOutOfBoundsException ae)
            {
                System.out.println("Array Index Out Of Bound Exception");
            }
        }
        System.out.println("Main Method End");
    }
    
}
