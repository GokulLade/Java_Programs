            /* In Interface Default method Demo Program (JDK 1.8)*/
class InterfaceDefault{
    public static void main(String[] args) 
    {
        System.out.println("***************************************");
        Arithmetic_Operation a=new Operation_1();
        int o1=a.add();
        int o2=a.sub();
        int o7=a.mul();             //Default Interface Method Calling
        System.out.println("Addition of Operation one is="+o1);
        System.out.println("Subtraction of Operation one is="+o2);
        System.out.println("Multiplication of Operation one is="+o7);

        System.out.println("***************************************");
        Arithmetic_Operation a1=new Operation_2();
        int o3=a1.add();
        int o4=a1.sub();
        int o8=a1.mul();   
        System.out.println("Addition of Operation Second is="+o3);
        System.out.println("Subtraction of Operation Second is="+o4);
        System.out.println("Multiplication of Operation one is="+o8);

        
        System.out.println("***************************************");
        Arithmetic_Operation a2=new Operation_3();
        int o5=a2.add();
        int o6=a2.sub();
        int o9=a2.mul();   
        System.out.println("Addition of Operation Third is="+o5);
        System.out.println("Subtraction of Operation Third is="+o6);
        System.out.println("Multiplication of Operation one is="+o9);

        
    }
}

interface Arithmetic_Operation{
    
    int add();
    int sub();
    default int mul()
    {
        int a=80,b=70;
        return a*b;
    }
}
class Operation_1 implements Arithmetic_Operation{
    int a=10,b=20;
    public int add()
    {
        return a+b;
    }
    public int sub()
    {
        return a-b;
    }
}
class Operation_2 implements Arithmetic_Operation{
    int a=400,b=220;
    public int add()
    {
        return a+b;
    }
    public int sub()
    {
        return a-b;
    }
}
class Operation_3 implements Arithmetic_Operation{
    int a=120,b=50;
    public int add()
    {
        return a+b;
    }
    public int sub()
    {
        return a-b;
    }
}