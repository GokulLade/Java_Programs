                /*User Exception and Exception Handling Demo Program */
public class UserException {
    public static void main(String[] args)
    {
        try
        {
            Show(12);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
    }
    public static void Show(int age) throws InValidAgeException
    {
        if(age<18)
        {
            throw new InValidAgeException("Not Allow For Voting");
        }
        else
        {
            System.out.println("Allow for Voting");
        }

    }
    
}
class InValidAgeException extends Exception{
    InValidAgeException(String msg)
    {
        System.out.println(msg);
    }
}

