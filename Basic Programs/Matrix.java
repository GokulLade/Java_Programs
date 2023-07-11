                /*Matrix Demo Program  */
import java.util.*;

public class Matrix {

    public static void main(String args [])
    {
       TwoD_Matrix s1=new TwoD_Matrix();
       s1.show1();

       Addition_Matrix s2=new Addition_Matrix();
       s2.show2();

       Transpose_Matrix s3=new Transpose_Matrix();
       s3.show3();

        Mirror_Matrix s4=new Mirror_Matrix();
        s4.show4();

    }
}
class TwoD_Matrix{
    void show1()
    {
        int a[][]=new int[2][2];

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Array Element");
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }

        System.out.println("Array Matrix are ");
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}

class Addition_Matrix{
    void show2()
    {
        int i=0,j=0;
        int a[][]=new int[2][2];
        int b[][]=new int[2][2];
        int c[][]=new int[2][2];

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First Array Element");
        for(i=0;i<2;i++)
        {
            for(j=0;j<2;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }

        System.out.println("Enter Second Array Element");
        for(i=0;i<2;i++)
        {
            for(j=0;j<2;j++)
            {
                b[i][j]=sc.nextInt();
            }
        }

        System.out.println(" First Array Element Matrix=");
        for(i=0;i<2;i++)
        {
            for(j=0;j<2;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println(" Second Array Element Matrix=");
        for(i=0;i<2;i++)
        {
            for(j=0;j<2;j++)
            {
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println(" Addition of Matrix is= ");
        for(i=0;i<2;i++)
        {
            for(j=0;j<2;j++)
            {
                c[i][j]=a[i][j]+b[i][j];
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }


    }
}

class Transpose_Matrix{

    void show3()
    {
        int i,j;
        int a[][]=new int[2][2];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Array Element");
        for(i=0;i<2;i++)
        {
            for(j=0;j<2;j++)
            {
                a[i][j]=sc.nextInt();
            }
            System.out.println();
        }

        System.out.println("Array Element Matrix= ");
        for(i=0;i<2;i++)
        {
            for(j=0;j<2;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("Transpose of Matrix=");
        for(i=0;i<2;i++)
        {
            for(j=0;j<2;j++)
            {
                System.out.print(a[j][i]+" ");
            }
            System.out.println();
        }
    }
}

class Mirror_Matrix{
    void show4()
    {
        int i,j;
        int a[][]=new int[2][2];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Array element");
        for(i=0;i<2;i++)
        {
            for(j=0;j<2;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }

        System.out.println("Array element Matrix= ");
        for(i=0;i<2;i++)
        {
            for(j=0;j<2;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("Mirror Matrix= ");
        for(i=0;i<2;i++)
        {
            for(j=1;j>=0;j--)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
