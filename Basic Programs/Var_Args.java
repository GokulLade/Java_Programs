                /*Multiple arg in one method Demo Program */

public class Var_Args {
    public static void main(String[] args) 
    {
        Addition a=new Addition();
        a.Sum(10,20);
        a.Sum(20,30,40,50);
        
    }
    
}
class Addition {
    
    void Sum(int... a)
    {
        int sum1=0;
        for (int b : a)
        {
            sum1=sum1+b;
        }
        System.out.println("Addition of Number is="+sum1);
    }
}
