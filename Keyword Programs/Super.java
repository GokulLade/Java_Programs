                    /* Super keyword Demo Program */
public class Super {
    public static void main(String[] args)
    {
        SuperVar_Demo1 s=new SuperVar_Demo1();
        s.show();

        SuperMethod_Demo1 s1=new SuperMethod_Demo1();
        s1.show2();

        SuperConstructor_Demo1 s2=new SuperConstructor_Demo1();
        
    }
}
            /* Super keyword for variable */
class SuperVar_Demo{
    
    int a=10;
    
}
class SuperVar_Demo1 extends SuperVar_Demo{
    
    void show()
    {
        int a=20;
        System.out.println(super.a);
    }
}

            /* Super keyword for method */
class SuperMethod_Demo{
    void show1()
    {
        System.out.println("Super Class");
    }

}
class SuperMethod_Demo1 extends SuperMethod_Demo{
    
    void show2()
    {
        super.show1();
        System.out.println("Sub class");
    }
}

            /* Super keyword for Constructor */
class SuperConstructor_Demo{
    
    SuperConstructor_Demo(int a)
    {
        System.out.println(a);
    }
}
class SuperConstructor_Demo1 extends SuperConstructor_Demo{
    
    SuperConstructor_Demo1()
    {
        super(200);
        System.out.println("Sub Class");
    }
}