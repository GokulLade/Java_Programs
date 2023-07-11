                /*Method Demo Program */
import java.util.*;
public class Method {
    int a=20;
    static int b=10;

    public static void main(String[] args)
    {
        int f=Method.show();
        Method m=new Method();
        int d=m.Dis();
        System.out.println(f);
        System.out.println(d);

        Recursion s1=new Recursion();
        int a=s1.show1(10);

        System.out.println(a);

        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to check Factorial");
        n=sc.nextInt();
        Method s2=new Method();
        int c=s2.show2(n);
        System.out.println("The Factorial of number is="+c);



    }

    //Factorial_Recursion

    int show2(int n)
    {
        if(n==1)
        {
            return 1;
        }

        else
        {
            return n*show2(n-1);
        }
    }

    static int show()
    {
        return b;
    }
    int Dis()
    {
        return a+b;
    }
}

class Recursion{
    int show1(int b)
    {
        if(b>0)
        {
            return b+show1(b-1);
        }
        else
        {
            return 0;
        }

    }
}
