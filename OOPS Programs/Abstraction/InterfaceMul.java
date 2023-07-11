           
           /*Using Interface Multiple Inheritance Program */

public class InterfaceMul {
    public static void main(String[] args) 
    {
        Names n=new Names();
        n.Name();

        
    }
    
}
interface Om{
    void Name();
}
interface Ram{
    void Name();
}
class Names implements Om,Ram{
    public void Name()
    {
        System.out.println("My Name is Om and Also you can calling me Ram because my nick name is Ram");

    }
}
