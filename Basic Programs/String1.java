                /* Using String Demo Program */
import java.io.*;
public class String1 {
    public static void main(String[] args)
    {
        String a="Aniket"; //String Literal Declaration
        System.out.println(a);

        a="Gokul";
        System.out.println(a);

        a=a.concat(" Lade");
        System.out.println(a);

        String b=new String("Aniket"); //Using new Keyword String Declaration
        System.out.println(b);
        String c=new String(" Chatarkar");
        b=b.concat(c);

        System.out.println(b);

        // Class object Declaration and Function calling

        String_Comparison s=new String_Comparison();
        s.show();

        String_Method s1=new String_Method();
        s1.show1();

        String_Reverse s2=new String_Reverse();
        s2.show2();

        ConSole1 s3=new ConSole1();
        s3.show3();

    }
}

class String_Comparison{            //Comparison of Two String
    void show()
    {
        String a="Gokul";
        String b=new String("Gokul");

        if(a.equals(b))
        {
            System.out.println("True");
        }

        else
        {
            System.out.println("False");
        }
        
    }
}

class String_Method{                //All Basic String Method
    void show1()
    {
        String a="Gokul";
        String b="Lade";
        String c="     Aniket     ";
        String d="";

        System.out.println(a.toUpperCase());
        System.out.println(b.toLowerCase());

        System.out.println(a.concat(b));
        System.out.println(b.length());

        System.out.println(c.trim());

        System.out.println(d.isEmpty());

        System.out.println(a.charAt(2));
        System.out.println(b.indexOf('e'));

        System.out.println(a.equals(b));

        System.out.println(a.replace('l', 'L'));

    }
}

class String_Reverse{
    void show2()                //Reverse String in Java
    {
        //First Method to Reverse String

        StringBuffer s=new StringBuffer("Gokul");
        System.out.println(s.reverse());

        //Second Method to Reverse String

        StringBuilder sb=new StringBuilder("Lade");
        System.out.println(sb.reverse());

        //Third Method to Reverse String
        
        String a="Ram";
        String b="";
        int l=a.length();
        for(int i=l-1;i>=0;i--)
        {
            b=b+b.charAt(i);

        }
        System.out.println(b);


        
    }
}

class ConSole1{
    void show3()                //Console is used to Security Purpose
    {
        String a;
        char b[];

        Console c= System.console();
        System.out.print("Enter the User Name: ");
        a=c.readLine();

        System.out.print("Enter the Password: ");
        b=c.readPassword();

        System.out.println("User Name= "+a);

        //Password is not print

        System.out.println("Password= "+b);

        //Password is print

        String e= String.valueOf(b);

        System.out.println("Password= "+e);


    }
}