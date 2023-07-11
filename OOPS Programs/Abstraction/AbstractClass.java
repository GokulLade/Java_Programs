                /*Abstract Class Demo Program */

public class AbstractClass {
    public static void main(String[] args) 
    {
    
        Shyam s=new Shyam();
        s.Behavior();
        Om o=new Om();
        o.Behavior();
        Ram r=new Ram();
        r.Behavior();
        
    }
    
}
abstract class Boy{
    Boy()
    {
        System.out.println("Behavior of the Boys");
    }
    abstract void Behavior();

}
class Om extends Boy{
    Om()
    {
        super();
    }
    @Override
    void Behavior()
    {
        System.out.println("Om :-Behavior is Good");
    }
}
class Ram extends Boy{
    @Override
    void Behavior()
    {
        System.out.println("Ram :-Behavior is very Good");
    }
}
class Shyam extends Boy{
    
    @Override
    void Behavior()
    {
        System.out.println("Shyam :-Not Good Behavior");
    }
}
