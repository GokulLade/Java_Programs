                /*All Operator using Demo Program */
import java.util.Scanner;

public class Operator {
    public static void main(String[] args) {
           Arithimatic a1= new Arithimatic();
           a1.Opr();

           Relational r1= new Relational();
           r1.Opr1();

           Logical l1= new Logical();
           l1.Opr2();

           Increment_Decrement id1= new Increment_Decrement();
           id1.Opr3();

           Assigment as1= new Assigment();
           as1.Opr4();

           Ternery t1= new Ternery();
           t1.Opr5();

           Bitwise b1= new Bitwise();
           b1.Opr6();
    }
}

class Arithimatic{
    void Opr()
    {
        int a,b;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter The First Number");
        a=sc.nextInt();
        System.out.println("Enter The Second Number");
        b=sc.nextInt();

        System.out.println("The Addition of two number is="+(a+b));
        System.out.println("The Subtraction of two number is="+(a-b));
        System.out.println("The Multiflication of two number is="+(a*b));
        System.out.println("The Division of two number is="+(a/b));
        System.out.println("The Mod of two number is="+(a%b));

    }
}

class Relational{
    void Opr1()
    {
        int a,b;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter The First Number");
        a=sc.nextInt();
        System.out.println("Enter The Second Number");
        b=sc.nextInt();

        System.out.println("The Number is Less Than="+(a<b));
        System.out.println("The Number is Greater Than="+(a>b));
        System.out.println("The Number is Less Than Equal="+(a<=b));
        System.out.println("The Number is Greater Than Equal="+(a>=b));
        System.out.println("The Number is Equal="+(a==b));
        System.out.println("The Number is Not Equal="+(a!=b));

    }
}

class Logical{
    void Opr2()
    {

        System.out.println("*****Logical AND*****");
        System.out.println((10>5) && (5>2));
        System.out.println((10>5) && (5>7));
        System.out.println((10>15) && (5>10));

        System.out.println("*****Logical OR*****");
        System.out.println((10>5) || (5>2));
        System.out.println((10>5) || (5>7));
        System.out.println((10>15) || (5>10));

        System.out.println("*****Logical NOT*****");
        System.out.println(!(10>5));
        System.out.println(!(10>15));

    }

}

class Increment_Decrement{
    void Opr3()
    {
        int a;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter The First Number");
        a=sc.nextInt();

        System.out.println("Post-Increment="+(a++));
        System.out.println("Pre-Increment="+(++a));

        System.out.println("Post-Decrement="+(a--));
        System.out.println("Pre-Decrement="+(--a));


    }
}

class Assigment{
    void Opr4()
    {
        int a;

        a=20; //simple
        System.out.println(a);

        a+=10; //compound (a=a+10)
        System.out.println(a);

        a-=20; //(a=a-20)
        System.out.println(a);
    }
}

class Ternery{
    void Opr5()
    {
        int Mark;
        System.out.println("Enter Your Mark");
        Scanner sc= new Scanner(System.in);
        Mark=sc.nextInt();


        System.out.println((Mark > 50) ? "Pass" : "Failed");
       
    }
}

class Bitwise{
    void Opr6()
    {
        int a=5, b=7;
        System.out.println("AND="+(a&b));
        System.out.println("OR="+(a|b));
        System.out.println("XOR="+(a^b));
        System.out.println("Complement="+(~a));

    }
}