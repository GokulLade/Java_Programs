                /*Constructor Demo Program */
public class Constructor {
    public static void main(String args[])
    {
        
        /* OOPS object Demo */

        Class_Demo s=new Class_Demo(); //first Type to declaration of Object
       
        // Class_Demo s;                //Second Type to declaration of Object
        // s=new Class_Demo();
        // s.show(); //calling function

        //Constructor
        Constructor_Demo s1=new Constructor_Demo();
        s1.show1();
       
        Default_Constructor s2=new Default_Constructor();
        s2.show2();
        
        Parametrized_Constructor p=new Parametrized_Constructor(58, "Gokul");
        
        Copy_Constructor cp=new Copy_Constructor(10,20);
        Copy_Constructor cp1=new Copy_Constructor(cp);
        
        //Private_Constructor pr=new Private_Constructor();
        
        
        Overloading_Constructor oc=new Overloading_Constructor();
        Overloading_Constructor oc1=new Overloading_Constructor(10,"Gokul");
        Overloading_Constructor oc2=new Overloading_Constructor(10,120.80,'G');
        System.out.println(oc.a+" "+oc.b+" "+oc.c+" "+oc.d);
        System.out.println(oc1.a+" "+oc1.d);
        System.out.println(oc2.a+" "+oc2.b+" "+oc2.c);
     }
    
}
class Class_Demo{       //OOPS class Demo Program    

    int a= 10;          //Instance variable Declaration
    int b=30;
    void show()
    {
        if(a<b)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
   }
}

class Constructor_Demo{     //Constructor Demo program
    int a,b,c;
    String d;
    Constructor_Demo()
    {
        a=0;
        d="NUll";

    }
    void show1()
    {
        System.out.println(a);
        System.out.println(d);
    }
}

class Default_Constructor{      //Default Constructor Demo program
    
    int a; String b; boolean c;
    Default_Constructor()
    {
        a=10;
        b="Gokul";
        c=true;

    }

    void show2()
    {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }
}

class Parametrized_Constructor{     //Parametrized Constructor Demo program
    
    Parametrized_Constructor(int a, String b)
    {
        System.out.println(a);
        System.out.println(b);
    }

}

class Copy_Constructor{             //Copy Constructor Demo program
    int a=10,b=20;
    Copy_Constructor(int x,int y)
    {
        x=a;
        y=b;
        System.out.println(a);
        System.out.println(b);
        
    }

    Copy_Constructor(Copy_Constructor ref)
    {
        a=ref.a;
        b=ref.b;
        System.out.println(a);
        System.out.println(b);   
    }
}

class Private_Constructor{              //Private Constructor Demo Program
    
    int a=10; double b=10.1; String c="Gokul"; char d='G';
    
    private Private_Constructor()
    {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
    /*public static void main(String[] args)
    {
        Private_Constructor pr=new Private_Constructor();
        
    }*/
}

class Overloading_Constructor{              //Overloading Constructor Demo Program

    int a; double b; char c; String d; 
    Overloading_Constructor()
    {
        a=20;
        b=130.89;
        c='G';
        d="Gokul"; 

    }

    Overloading_Constructor(int x, String y)
    {
        a=x;
        d=y;
    }

    Overloading_Constructor(int p, double q, char r)
    {
        a=p;
        b=q;
        c=r;   
    }
}