                /*Pattern printing Demo program */
import java.util.*;

public class Pattern {
    public static void main(String args[])
    {
        Star1_Pattern s1=new Star1_Pattern();
        s1.show1();

        Star3_Pattern s3=new Star3_Pattern();
        s3.show3();

        Star4_Pattern s4=new Star4_Pattern();
        s4.show4();

        Star2_Pattern s2=new Star2_Pattern();
        s2.show2();

        Star5_Pattern s5=new Star5_Pattern();
        s5.show5();

        Star6_Pattern s6=new Star6_Pattern();
        s6.show6();

        Number_Pattern s7=new Number_Pattern();
        s7.show7();
        s7.show8();
        s7.show9();

        Char_Pattern s10=new Char_Pattern();
        s10.show10();
        s10.show11();
        s10.show12();

        Diamond_Patter s13=new Diamond_Patter();
        s13.show13();

        HalfDiamond_Pattern s14=new HalfDiamond_Pattern();
        s14.show14();






    }
}
class Star1_Pattern{
    void show1()
    {
        int i,j;
        for (i=1;i<=7;i++) //Rows
        {
            for (j=1;j<=i;j++)//Column
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }

    }
}
class Star2_Pattern{
    void show2()
    {
        System.out.print("\n");
        int i,j,k;
        for (i=1;i<=7;i++)//Rows i=1,2,3
        {
            for (j=1;j<i;j++)//Space j=1,2,3
            {
                System.out.print(" ");
            }
            for(k=i;k<=7;k++)//Column //k=1,2,3
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }

    }
}

class Star3_Pattern{
    void show3()
    {
        System.out.print("\n");
        int i,j,k;
        for (i=1;i<=7;i++)//Rows //1,2
        {
            for (j=7;j<i;j--)//Space //7
            {
                System.out.print(" ");
            }
            for(k=1;k<=i;k++)//Column //1,
            {
                System.out.print("* ");
            }
            System.out.print("\n");
        }

    }
}

class Star4_Pattern{
    void show4()
    {
        System.out.print("\n");
        int i,j;
        for (i=1;i<=7;i++)//Rows //i=1,2
        {
            for (j=7;j>=i;j--)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }

    }
}

class Star5_Pattern{
    void show5()
    {
        int i,j;
        for (i=1;i<=7;i++)
        {
            for (j=1;j<=7;j++)
            {
                if(i==1 || i==7 || j==1 || j==7)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }

            }
            System.out.print("\n");
        }
    }

}

class Star6_Pattern{
    void show6()
    {
        int i,j,k;

        for (i=1;i<=7;i++) //i=1 2
        {
            for (j=7;j>i;j--) //j=7 6 5 4 3 2 False
            {
                System.out.print(" ");
            }

            for (k=1;k<=i;k++)
            {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}

class Number_Pattern{
    void show7()
    {
        int i,j;

        for(i=1;i<=7;i++)
        {
            for (j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.print("\n");
        }
    }

    void show8()
    {
        int i,j;

        for(i=1;i<=7;i++)
        {
            for (j=1;j<=i;j++)
            {
                System.out.print(i);
            }
            System.out.print("\n");
        }
    }

    void show9()
    {
        int i,j,a=0;

        for(i=1;i<=7;i++)
        {
            for (j=1;j<=i;j++)
            {
                a++;
                System.out.print(a+" ");
            }
            System.out.print("\n");
        }
    }
}

class Char_Pattern{
    void show10()
    {
        char i,j;
        for(i='A';i<='G';i++)
        {
            for(j='A';j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    void show11()
    {
        char i,j;
        for(i='A';i<='G';i++)
        {
            for(j='A';j<=i;j++)
            {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    void show12()
    {
        char i,j,a='A';
        for(i='A';i<='G';i++)
        {
            for(j='A';j<=i;j++)
            {

                System.out.print(a);
                a++;
            }
            System.out.println();
        }
    }
}

class Diamond_Patter{
    void show13()
    {
        int i,j,k;
        for (i=1;i<=7;i++)
        {
            for (j=7;j>i;j--)
            {
                System.out.print(" ");
            }
            for (k=1;k<=(2*i-1);k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        for (i=6;i>=1;i--)
        {
            for (j=7;j>i;j--)
            {
                System.out.print(" ");
            }
            for (k=1;k<=(2*i-1);k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

class HalfDiamond_Pattern{
    void show14()
    {
        int i,j;
        for (i=1;i<=7;i++)
        {
            for (j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        for (i=6;i>=1;i--)
        {
            for (j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
