                /*User Input Demo Program */
import java.util.*;
import java.io.*;

public class Input {
    public static void main(String[] args)throws IOException
     {
        Sum a1= new Sum();
        a1.Add1();

        Sub s1= new Sub();
        s1.sub1();

    }
}
        /* Using Scanner class Input */
class Sum{
    void Add1()
    {
        int a,b,c;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the first Number");
        a= sc.nextInt();

        System.out.println("Enter the Second Number");
        b= sc.nextInt();

        c=a+b;
        System.out.println("The Addition of two number is="+c);
    }
}

    /* Using BufferedReader class Input */
class Sub{
    void sub1() throws IOException
    {
        int d,e,f;
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the first Number");
        d=Integer.parseInt(br.readLine());

        System.out.println("Enter the Second Number");
        e=Integer.parseInt(br.readLine());



        f=d-e;
        System.out.println("The Subtraction of two number is="+f);

    }
}
