            /* Abstract method Demo Program */

class AbstractMethod{
    public static void main(String[] args) 
    {
        HTML h=new HTML();
        h.Developer();
        Java j=new Java();
        j.Developer();
        
    }
}
abstract class Programming{
    
    abstract void Developer();
}
class Java extends Programming{
    
    @Override
    void Developer()
    {
        System.out.println("james Gosling");

    }
}
class HTML extends Programming{

    @Override
    void Developer()
    {
       
        System.out.println("Tim Berners Lee");
    }
}