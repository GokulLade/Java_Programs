                /* Interface Method program */
public class InterfaceMethod {
    public static void main(String[] args) 
    {
        Om_Developer o=new Om_Developer();
        o.Frontend();
        o.Backend();
        
    }
    
}

interface Client{
    
    void Frontend();
    void Backend();
}
abstract class Raj_Developer implements Client{      //Raj not completed the website They only completed frontend of the Website
    @Override
    public void Frontend()
    {
        String Lan1,Lan2,Lan3;
        Lan1="HTML";
        Lan2="CSS";
        Lan3="Javascript";
        System.out.println("Using "+Lan1 +Lan2 +Lan3 +"Completed the Frontend");

    }
}
class Om_Developer extends Raj_Developer{   //Om completed the website using Raj frontend code
    @Override
    public void Backend()
    {
        System.out.println("Using Java Language complete the Backend");
    }
}
