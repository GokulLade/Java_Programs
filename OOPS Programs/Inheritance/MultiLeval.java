                /*Using Multilevel Inheritance Demo Program */
import java.util.*;

class Input1{                        //Super class
    int a;
    void In1()
    {
        
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter First Number");
        a= s1.nextInt();

    }
}

class Input2 extends Input1{            //Sub1 class
    int b;
    void In2()
    {
        Scanner s2= new Scanner(System.in);
        System.out.println("Enter Second Number");
        b= s2.nextInt();
    
    }
}

class Add extends Input2{               //Sub2 class
    void add()
    {
        int c=a+b;
        System.out.println("The Addition is="+c);

    }
}

class MultiLeval{
    public static void main(String[] args) 
    {
        Add a1=new Add();
        a1.In1();
        a1.In2();
        a1.add();
        
    }
}