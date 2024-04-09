                /*Using throw and throws Demo Program*/
public class Throw_Throws {
    public static void main(String[] args) throws ArithmeticException
    {
        Throw_Throws tt=new Throw_Throws();
        try
        {
             tt.div(30, 0);
        }
        catch(Exception e)
        {
            System.out.println("0 is Not Divided by any Number");
        }
       
        
    }
  
  //throws example Program
    void div(int a,int b) throws ArithmeticException
    {
        if(b==0)
        {
            throw new ArithmeticException();
        }
        else
        {
            int c=a/b;
            System.out.println("Division is="+c);
        }
    }
    
}
