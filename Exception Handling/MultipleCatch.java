                /*Multiple Catch Using Demo Program */
public class MultipleCatch {
    public static void main(String[] args) 
    {
        try
        {
            int a=10,b=2,c;
            c=a/b;
            System.out.println(c);

            int d[]={1,2,3,4};
            System.out.println(d[4]);

            String str=null;
            System.out.println(str.toUpperCase());

            String st="Gokul";
            int e=Integer.parseInt(st);
            System.out.println(e);
        }
        catch(ArithmeticException a)
        {
            System.out.println("Arithmetic Exception");
        }
        catch(ArrayIndexOutOfBoundsException arr)
        {
            System.out.println("Array Index Out Of Bound Exception");
        }
        catch(NullPointerException np)
        {
            System.out.println("Null Pointer Exception");
        }
        catch(Exception e)          //It is Compulsory 
        {
            System.out.println("Exception is Occur");
        }
        
    }
    
}
