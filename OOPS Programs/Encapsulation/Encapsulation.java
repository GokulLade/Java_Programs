                /*Encapsulation Demo Program */
class A{
    private int value;  //Data Hiding
    
    public void setvalue(int x) //Abstract Method
    {
       value=x;

    }
    public int getvalue()
    {
        return value;
    }

}

public class Encapsulation{
    public static void main(String[] args) 
    {
        A a1=new A();
        a1.setvalue(100);
        System.out.println(a1.getvalue());
        
    }
   
    
}