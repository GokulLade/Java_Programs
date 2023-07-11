                /*Block in java program Demo */
public class Block {
    

    static int a=10; //Static variable Declaration
    
    static          //Static block Demo program
    {
       
        System.out.println(a);

    }

    public static void main(String[] args)
    {
        Instance_Block ib=new Instance_Block();
    }
}

class Instance_Block{       //Instance block Demo program
    
    {
        int a=10,b=20;
        System.out.println("Addition is="+(a+b));
    }
}


