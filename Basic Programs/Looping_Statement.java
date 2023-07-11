            /*All Looping Statement Demo Program */
import java.util.Scanner;

public class Looping_Statement {
    public static void main(String[] args) {
        While_Loop s=new While_Loop();
        s.show();
        s.show1();

        DO_While_Loop s1=new DO_While_Loop();
        s1.show2();
        s1.show3();

        For_Loop s2=new For_Loop();
        s2.show4();

        Nested_For_Loop s3=new Nested_For_Loop();
        s3.show5();

        For_Each_Loop s4=new For_Each_Loop();
        s4.show6();
    }
}
class While_Loop{
    void show() //Unlimited Time Loop
    {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        n=sc.nextInt();
        while (n>=0)
        {
            System.out.println("Gokul");
        }
    }

    void show1()//Limited Time Loop
    {
        int n1=1;
        while (n1<=10)
        {
            System.out.println(n1);
            ++n1;
        }

    }

}

class DO_While_Loop{
    void show2() //Condition False
    {
        int a=10;
        do
        {
            System.out.println(a);
        }
        while (a>=20);

    }

    void show3()//Condition True
    {
        int n=1;
        do
        {
            System.out.println(n);
            ++n;
        }
        while(n<=10);
    }
}

class For_Loop{
    void show4()
    {

        for (int i=1;i<=20;i++)
        {
            System.out.println(i);
        }
    }
}

class Nested_For_Loop{
    void show5()
    {
        for (int i=1;i<=5;i++)
        {
            for (int j=1;j<=5;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

class For_Each_Loop{
    void show6()
    {
       int a[]={10,11,12,13,14,15};
        for (int n: a)
        {
            System.out.println(n);
        }
        for (int i=0;i<=a.length;i++)//Using For loop
        {
            System.out.println(a[i]);
        }
    }
}
