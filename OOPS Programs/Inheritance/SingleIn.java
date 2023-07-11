                /*Using Single/Simple Inheritance Demo Program */

class Op{                           //Super class
    int a=10, b=20;
    public void Add()
    {
        int c=a+b;
        System.out.println("The addition is"+" "+c);
        
    }
}

class Op1 extends Op{               //Sub class
    void Sub()
    {
        int d=a-b;
        System.out.println("The Subtraction is"+" "+d);
    
    }
}

class SingleIn{
    public static void main(String args[])
    {
        Op1 a1=new Op1();
        a1.Add();
        a1.Sub();
    }
}

