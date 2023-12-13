           
           /*Using Interface Multiple Inheritance Program */

public class InterfaceMul {
    public static void main(String[] args) 
    {
        Names n=new Names();
        n.Name();

        
    }
    
}
interface Om3{
    void Name();
}
interface Ram2{
    void Name();
}
class Names implements Om3,Ram2{
    public void Name()
    {
        System.out.println("My Name is Om and Also you can calling me Ram because my nick name is Ram");

    }
}
