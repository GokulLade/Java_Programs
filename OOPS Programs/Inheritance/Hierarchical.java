                /*Using Hierarchical Inheritance Demo Program */
import java.util.*;

class Input{
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

class Add extends Input{
    void add()
    {
        System.out.print("The Addition of two Number is="+(a+b));
    }
}

class Sub extends Input{
    void sub()
    {
        System.out.print("The Subtraction of two Number is"+(a-b));

    }
}

class Mul extends Input{
    void mul()
    {
        System.out.print("The Multiplication of two number is"+(a*b));
    }
}

class Div extends Input{
    void div()
    {
        System.out.print("The Division of two Number is"+(a/b));
    }
}

class Hierarchical {
    public static void main(String[] args) 
    {
        Add a=new Add();
        a.In1();
        a.add();

        Sub s=new Sub();
        s.sub();

        Mul m=new Mul();
        m.mul();

        Div d=new Div();
        d.div();
        
        
    }
    
}
