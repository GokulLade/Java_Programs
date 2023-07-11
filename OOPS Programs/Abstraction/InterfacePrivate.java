                /* In Interface Private method Demo Program (JDK 1.9) */
public class InterfacePrivate {
    public static void main(String args[])
    {
       System.out.println("******************Student Details********************************************************");
        
        Student_1 s1=new Student_1();
        s1.Name();
        s1.CourseName();
        s1.Mark();
        s1.call_1();
        Show.call_2();
      System.out.println("********************************************************************************************");
        Student_2 s2=new Student_2();
        s2.Name();
        s2.CourseName();
        s2.Mark();
        s2.call_1();
        Show.call_2();

      System.out.println("********************************************************************************************");
        Student_3 s3=new Student_3();
        s3.Name();
        s3.CourseName();
        s3.Mark();
        s3.call_1();
        Show.call_2();
        
    }
    
}
interface Show{
    
    default void call_1()
    {
        CollegeName();  //Calling Private method
    }
    static void call_2()
    {
        University();   //Calling static private method
    }
    void Name(); //public+abstract
    void CourseName();
    void Mark();
    void Percentage();
    private void CollegeName()//private+static
    {
        System.out.println("College Name is= Deogiri college Chh.Sambhajinager");
    }
    private static void University() //private 
    {
        System.out.println("University Name= Dr Babasaheb Ambedkar Marathwada University Chh.Sambhajinager ");
    }
}
class Student_1 implements Show{
    public void Name()
    {
        System.out.println("1) Gokul Lade");

    }
    public void CourseName()
    {
        System.out.println("Student Course= BCA(sci)");
    }
    public void Mark()
    {
        System.out.println("First year mark is=566");
    }
    public void Percentage()
    {
        System.out.println("Percentage is= 74%");
    }
}

class Student_2 implements Show{
    public void Name()
    {
        System.out.println("2) Shreyas Dabke");

    }
    public void CourseName()
    {
        System.out.println("Student Course= BCA(sci)");
    }
    public void Mark()
    {
        System.out.println("First year mark is=600");
    }
    public void Percentage()
    {
        System.out.println("Percentage is= 76%");
    }
}

class Student_3 implements Show{
    public void Name()
    {
        System.out.println("3) Shubham Sawai");

    }
    public void CourseName()
    {
        System.out.println("Student Course= BCA(management)");
    }
    public void Mark()
    {
        System.out.println("First year mark is=400");
    }
    public void Percentage()
    {
        System.out.println("Percentage is= 63%");
    }
}

