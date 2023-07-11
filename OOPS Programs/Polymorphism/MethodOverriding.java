                /*Run time Polymorphism using Method Overriding Program */
class Student1{
    void Name()
    {
        System.out.println("Gokul Lade");

    }
}

class Student2 extends Student1{
   
    @Override
    void Name()
    {
        super.Name();
        System.out.println("Vijay Lade");
    }
}

public class MethodOverriding {
    public static void main(String[] args) 
    {
        Student1 s1=new Student2();
        s1.Name();
        
    }
    
}
