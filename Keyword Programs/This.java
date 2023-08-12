                /* this keyword Demo Program */
class This{
    
    public static void main(String[] args) 
    {
        This r=new This();
        System.out.println(r);
        r.show();
        
        ThisVar_Demo1 s=new ThisVar_Demo1();
        s.show2();

        ThisCon_Demo s1=new ThisCon_Demo(20);

        ThisCon1_Demo s2=new ThisCon1_Demo();
    }
    void show()
    {
        System.out.println(this);
    }
}

            /* this keyword for variable */
class ThisVar_Demo{
    int a;
    void show1(int a)
    {
        this.a=a;
    }
}
class ThisVar_Demo1 extends ThisVar_Demo{
    void show2()
    {
        super.show1(20);
        System.out.println(a);
    }
}

             /* this keyword for call default Constructor */
class ThisCon_Demo{
    
    ThisCon_Demo()
    {
        System.out.println("Default Constructor");
    }
    ThisCon_Demo(int a)
    {
        this();
        System.out.println("Parametrized Constructor="+a);
    }
}

            /* this keyword for call Parametrized Constructor */
class ThisCon1_Demo{
    ThisCon1_Demo()
    {
        this(10,20);
        System.out.println("Default Constructor");

    }
    ThisCon1_Demo(int a,int b)
    {
        System.out.println("Add="+(a+b));
    }
}
