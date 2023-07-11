                /* Basic Programs */
import java.util.Scanner;

public class Program_1 {
    public static void main(String[] args) {

        Sum_N_Number s1=new Sum_N_Number();
        s1.show1();

        Sum_Even_Number s2=new Sum_Even_Number();
        s2.show3();

        Char_Input s3=new Char_Input();
        s3.show2();

        Check_Char s4=new Check_Char();
        s4.show4();

        ASCII s5=new ASCII();
        s5.show5();

        Factorial s6=new Factorial();
        s6.show6();

        Swap s7=new Swap();
        s7.show7();

        Fibonacii_Series s8=new Fibonacii_Series();
        s8.show8();

        Tribonacii_Series s9=new Tribonacii_Series();
        s9.show9();

    }
}

class Sum_N_Number{
    void show1()
    {
        int n,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        n=sc.nextInt();

        for (int i=0;i<=n;i++)
        {
            sum=i+sum;

        }
        System.out.println("Addition is="+sum);
    }
}

class Char_Input{
    void show2()
    {
        char c;
        System.out.println("Enter the Character");
        Scanner sc=new Scanner(System.in);
        c=sc.next().charAt(0);

        System.out.println("The First Character is="+c);
    }
}

class Sum_Even_Number{
    void show3()
    {
        int sum=0,n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        n=sc.nextInt();

        for(int i=0;i<=n;i=i+2)
        {
            System.out.println(i);
            sum=sum+i;
        }
        System.out.println(sum);
    }
}

class Check_Char{
    void show4()
    {
        char ch;
        System.out.println("Enter the Character to check Vowel or Consonant");
        Scanner sc=new Scanner(System.in);
        ch=sc.next().charAt(0);

        if(ch=='a')
        {
            System.out.println("The Character is Vowel");
        }
        else if (ch=='e')
        {
            System.out.println("The Character is Vowel");
        }
        else if (ch=='i')
        {
            System.out.println("The Character is Vowel");
        }
        else if (ch=='o')
        {
            System.out.println("The Character is Vowel");
        }
        else if (ch=='u')
        {
            System.out.println("The Character is Vowel");
        }
        else
        {
            System.out.println("The Character is Consonant");
        }

    }
}

class ASCII{
    void show5()
    {
       char ch;
       Scanner r=new Scanner(System.in);
       System.out.println("Enter the Character to Check Ascii Value");
       ch= r.next().charAt(0);
       int a=ch;
       System.out.println("The Ascii Value of the Character is="+a);

    }
}

class Factorial{
    void show6()
    {
        int a ,fact=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number to check Factorial of number");
        a=sc.nextInt();
        for (int i=1;i<=a;i++)
        {
            fact=fact*i;
        }
        System.out.println("The Factorial of Number is="+fact);


    }

}

class Swap{
    void show7()
    {
        int a, b,temp=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Numbers");
        a = sc.nextInt();
        b = sc.nextInt();

        System.out.println("Before the Swapping a=" + a + "b=" + b);
        temp=a;
        a=b;
        b=temp;

        System.out.println("After the Swapping a=" + a + "b=" + b);

    }

}

class Fibonacii_Series
{
    void show8()
    {
        int n,n1=0,n2=1,n3,i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Limit");
        n=sc.nextInt();
        for(i=0;i<=n;i++)
        {
            System.out.println(n1);
            n3=n1+n2;
            n1=n2;
            n2=n3;
        }

    }

}

class Tribonacii_Series{
    void show9()
    {
        int n=0,n1=1,n2=2,r,i,limit;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Limit");
        limit=sc.nextInt();

        for(i=1;i<=limit;i++)
        {
            System.out.println(n);
            r=n+n1+n2;
            n=n1;
            n1=n2;
            n2=r;
        }



    }

}

