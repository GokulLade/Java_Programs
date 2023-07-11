                /*Multiple Try Catch block in one Program */
public class MultipleTry_catch {
    public static void main(String[] args) 
    {
        try
        {
            int a=20,b=2,c;
            c=a/b;
            System.out.println(c);
        }
        catch(ArithmeticException a)
        {
            System.out.println("Not Divided by Zero");
        }

        try
        {
            int a[]={1,2,3,4};
            System.out.println(a[1]);
        }
        catch(ArrayIndexOutOfBoundsException b)
        {
            System.out.println("Array index is Not found");
        }

    }
    
}
