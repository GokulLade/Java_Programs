                /*Null Pointer Exception java Demo Program */
public class NullpointerException {
    public static void main(String[] args)
    {
        //NullPointerException
        String str=null;
        try
        {
            System.out.println(str.toUpperCase());
        }
        catch(Exception e)
        {
            System.out.println("It is Not Possible to null Convert to Upper case");
        }
        
        
    }
    
}
