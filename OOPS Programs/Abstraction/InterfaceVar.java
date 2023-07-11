                /* Interface variable Program */
public class InterfaceVar {
    public static void main(String[] args) 
    {
        Customer c=new Seller();
        c.Purchase();
        
    }
    
}

interface Customer{
    
    int rice=5;     //public + static + final
    void Purchase();    //public abstract

}
class Seller implements Customer{
    @Override
    public void Purchase()
    {
        System.out.println("Customer needs "+ rice +" kg Rice");
    }

}

