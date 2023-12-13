                /*Using Hierarchical Inheritance Demo Program */
import java.util.*;

class Input_1{
    int a,b;
    void In1()
    {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter First Number");
        a= s1.nextInt();

        Scanner s2= new Scanner(System.in);
        System.out.println("Enter Second Number");
        b= s2.nextInt();
    

    }
}

class Add_1 extends Input_1{
    void add()
    {
        System.out.print("The Addition of two Number is="+(a+b));
    }
}

class Sub_1 extends Input_1{
    void sub()
    {
        System.out.print("The Subtraction of two Number is"+(a-b));

    }
}

class Mul extends Input_1{
    void mul()
    {
        System.out.print("The Multiplication of two number is"+(a*b));
    }
}

class Div extends Input_1{
    void div()
    {
        System.out.print("The Division of two Number is"+(a/b));
    }
}

class Hierarchical {
    public static void main(String[] args) 
    {
        Add_1 a=new Add_1();
        a.In1();
        a.add();

        Sub_1 s=new Sub_1();
        s.sub();

        Mul m=new Mul();
        m.mul();

        Div d=new Div();
        d.div();
        
        
    }
    
}
