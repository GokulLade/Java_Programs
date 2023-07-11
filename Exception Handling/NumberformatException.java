                /*Number Format Exception handling using try and catch block demo Program */
public class NumberformatException {
    public static void main(String[] args)
    {
        String str="Gokul";
        try
        {
            int a=Integer.parseInt(str);
            System.out.println(a);
        }
        catch(Exception e)
        {
            System.out.println(str+" Can't be converted to Integer ");
        }
    }
    
}
