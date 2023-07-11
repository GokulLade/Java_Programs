                /* If Statement Demo Program */
import java.util.Scanner;

public class If_Statement {
    public static void main(String[] args)
    {
       Simple_If s= new Simple_If();
       s.Show();

       If_Else s1= new If_Else();
       s1.show1();

       Else_If_Ladder s2=new Else_If_Ladder();
       s2.show2();

         Nested_If_Else s3=new Nested_If_Else();
         s3.show3();

    }
}

class Simple_If{
    void Show()
    {
       int a;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Your Age");
        a=sc.nextInt();
        if(a>=18)
        {
            System.out.println("You are aligiable for Voting");
        }
        System.out.println("Thank You......");
    }
}

class If_Else{
    void show1()
    {
        int a;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Age");
        a=sc.nextInt();
        if(a>=18)
        {
            System.out.println("You are eligiable for voting");
        }
        else
        {
            System.out.println("You are not eligiable for voting");
        }

        System.out.println("Thank You.....");

    }

}

class Else_If_Ladder{
    void show2()
    {
        int per;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter you Percentage");
        per=sc.nextInt();
        if(per>=80)
        {
            System.out.println("Your Grade is  = A+" );
        }
        else if (per>=60)
        {
            System.out.println("Your Grade is = B");
        }
        else if (per>=20)
        {
            System.out.println("Your Grade is = C");

        }
        else
        {
            System.out.println("Your Grade is = Fail");
        }
    }
}

class Nested_If_Else {
    void show3() {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        a = sc.nextInt();

        System.out.println("Enter the Second number");
        b = sc.nextInt();

        System.out.println("Enter the Third number");
        c = sc.nextInt();

        if (a > b) {
            if (a > c) {
                System.out.println(a + "=Is Greater Number");
            } else {
                System.out.println(c + "=Is Greater Number ");
            }

        } else {
            if (b > c) {
                System.out.println(b + "=Is Greater Number");
            } else {
                System.out.println(c + "= IS Greater Number");
            }

        }
    }
}



