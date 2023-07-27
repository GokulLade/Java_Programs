                // Array Program in java

import java.util.*;

public class Array {
    public static void main(String[] args)
    {
        Array1 s1=new Array1(); //Object created
        s1.show1();             //Function Calling

        Array2 s2=new Array2();
        s2.show2();

        Array3 s3=new Array3();
        s3.show3();

        Copy_Array s4=new Copy_Array();
        s4.show4();

        Add_Array s5=new Add_Array();
        s5.show5();

        Reverse_Array s6=new Reverse_Array();
        s6.show6();

        Search_Array s7=new Search_Array();
        s7.show7();

        Average_Array s8=new Average_Array();
        s8.show8();

        Ascending_Array s9=new Ascending_Array();
        s9.show9();

        Descending_Order s10=new Descending_Order();
        s10.show10();

        Array_Methods s11=new Array_Methods();
        s11.show11();
        s11.show12();
        s11.show13();

        BiggestElement_Array s14=new BiggestElement_Array();
        s14.show14();

        SmallestElement_Array s15=new SmallestElement_Array();
        s15.show15();

        Insert_Array s16=new Insert_Array();
        s16.show16();

        Delete_Array s17=new Delete_Array();
        s17.show17();
    }
}
class Array1{
    void show1()                //Array Declaration and Print
    {
        int a[]={10,20,30,40,50};
        System.out.println(a[2]);
    }
}

class Array2 {
    void show2()                //Using for loop Print Array Element
    {
        int a[] = {10, 20, 30, 40, 50};
        for (int i = 0; i <= a.length; i++)
        {
            System.out.println(a[i]);
        }
    }
}

class Array3{
    void show3()            //Array Size input from user
    {
        int size;
        Scanner r=new Scanner(System.in);
        System.out.println("Enter the Size of Array");
        size=r.nextInt();
        int a[]=new int[size];

        System.out.println("Enter the Array Element");
        for(int i=0;i<size;i++)
        {
            a[i]=r.nextInt();
        }

        System.out.println("Array Elements Are:-");
        for (int i=0;i<size;i++)
        {
            System.out.println(a[i]);
        }
    }
}

class Copy_Array{
    void show4()                //Copy Array Element
    {
        int a[]=new int[5];
        int b[]=new int[5];

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Array Element");
        for(int i=0;i<=a.length;i++)
        {
            a[i]=sc.nextInt();
        }

        System.out.println("The First Array Element are=");
        for(int i=0;i<=a.length;i++)
        {
            System.out.println(a[i]);
        }

        System.out.println("The Second Array Element are=");
        for(int i=0;i<=b.length;i++)
        {
            b[i]= a[i];

            System.out.println(b[i]);
        }

    }
}

class Add_Array{
    void show5()                //Add Array Element
    {
        int a[]=new int[7]; int sum=0;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Array Element");
        for(int i=0;i<7;i++)
        {
            a[i]=sc.nextInt();
        }

        System.out.println("The Array Element are=");
        for(int i=0;i<7;i++)
        {
            System.out.println(a[i]);
        }

        System.out.println("The sum of Array Element is=");

        for(int i=0;i<7;i++)
        {
            sum=a[i]+sum;
        }
        System.out.println(sum);

    }
}

class Reverse_Array{
    void show6()                //Reverse Array
    {
        int a[]=new int[5];
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Array Element");
        for (int i=0;i<5;i++)
        {
            a[i]=sc.nextInt();
        }

        System.out.println("The Array Elements are=");
        for (int i=0;i<5;i++)
        {
            System.out.println(a[i]);
        }

        System.out.println("The Array Elements in Reverse are=");
        for (int i=5-1;i>=0;i--)
        {
            System.out.println(a[i]);
        }
    }
}

class Search_Array{
    void show7()                //Search Array Element
    {
        int a[]=new int[5];int i,c=0,n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Array Elements");
        for (i=0;i<5;i++)
        {
            a[i]=sc.nextInt();
        }

        System.out.println("Array Element are=");
        for (i=0;i<5;i++)
        {
            System.out.println(a[i]);
        }

        System.out.println("Enter Search Element");
        n=sc.nextInt();
        int b=0;
        for (i=0;i<5;i++)
        {
            if(n==a[i])
            {
                b=i;
                c++;
            }
        }
        if (c>0)
        {
            System.out.println("Element is Found at position="+b);
            System.out.println("Element is Found for="+c);

        }
        else
        {
            System.out.println("Element is Not Found ");
        }

    }
}

class Average_Array{
    void show8()
    {
        int a[]=new int[5];
        int i,sum=0;
        double avr=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Array Element");
        for (i=0;i<5;i++)
        {
            a[i]=sc.nextInt();
        }

        System.out.println("Array Element are");
        for (i=0;i<5;i++)
        {
            System.out.println(a[i]);
        }

        System.out.println("Average of Array Element is=");
        for (i=0;i<5;i++)
        {
            sum=a[i]+sum;
        }
        avr=sum/5;
        System.out.println(avr);
    }
}

class Ascending_Array{
    void show9()
    {
        int a[]=new int[5];
        int i,temp=0;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Array Element");
        for (i=0;i<5;i++)
        {
            a[i]=sc.nextInt();
        }

        System.out.println("Array Element are");
        for (i=0;i<5;i++)
        {
            System.out.println(a[i]);
        }

        System.out.println("Array Element in Ascending Order");
        for (i=0;i<5;i++)
        {
            for (int j=i+1;j<5;j++)
            {
                if (a[i]>a[j])
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        for (i=0;i<5;i++)
        {
            System.out.println(a[i]);
        }
    }
}

class Descending_Order{
    void show10()
    {
        int a[]=new int[5];
        int temp=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Array Element");
        for (int i=0;i<5;i++)
        {
            a[i]=sc.nextInt();
        }

        System.out.println("Array Element are");
        for (int i=0;i<5;i++)
        {
            System.out.println(a[i]);
        }

        System.out.println("Array Element in Descending order");
        for (int i=0;i<5;i++)
        {
            for (int j=i+1;j<5;j++)
            {
                if (a[i]<a[j])
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }

            }
        }

        for (int i=0;i<5;i++)
        {
            System.out.println(a[i]);
        }
    }
}

class Array_Methods{
    void show11()
    {
        /* sort() Method  */

        int a[]=new int[5];
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Array Element");
        for(int i=0;i<5;i++)
        {
            a[i]=sc.nextInt();
        }

        System.out.println("Array Element are");
        for(int i=0;i<5;i++)
        {
            System.out.println(a[i]);
        }

        Arrays.sort(a);

        System.out.println("Array Element in Sorting Order is");
        for (int i=0;i<5;i++)
        {
            System.out.println(a[i]);
        }
    }

    void show12()
    {
        /* equals Method  */

        int a[]=new int[5];
        int b[]=new int[5];
        int i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Array Element");
        for (i=0;i<5;i++)
        {
            a[i]=sc.nextInt();
        }

        System.out.println("Enter Second Array Element");
        for (i=0;i<5;i++)
        {
            b[i]=sc.nextInt();
        }

        boolean c=Arrays.equals(a,b);
        System.out.println("Array Element are Equals="+c);
    }

    void show13()
    {
        /* copyOf() Method  */

        int a[]=new int[5];
        int i;

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First Array Element");
        for (i=0;i<5;i++)
        {
            a[i]=sc.nextInt();
        }

        int b[]=Arrays.copyOf(a,5);
        System.out.println("Second Array Element are=");
        for (i=0;i<5;i++)
        {
            System.out.println(b[i]);
        }



    }
}

class BiggestElement_Array{
    void show14()
    {
        int a[]=new int[5];
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Array Element");
        for (int i=0;i<5;i++)
        {
            a[i]=sc.nextInt();
        }

        System.out.println("Biggest Element in Array is=");
        int max=a[0];
        for (int i=1;i<5;i++)
        {
            if (a[i]>max)
            {
                max=a[i];
            }
        }
        System.out.println(max);
    }
}

class SmallestElement_Array{
    void show15()
    {
        int a[]=new int[5];
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Array Element");
        for (int i=0;i<5;i++)
        {
            a[i]=sc.nextInt();
        }

        System.out.println("Smallest Element in Array is=");
        int min=a[0];
        for (int i=1;i<5;i++)
        {
            if (a[i]<min)
            {
                min=a[i];
            }
        }
        System.out.println(min);

    }
}

class Insert_Array{
    void show16()
    {
        int size=0,loc,item,i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Array Size");
        size=sc.nextInt();
        int a[]=new int[size+1];
        System.out.println("Enter the Array Element");
        for (i=0;i<size;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the Location");
        loc=sc.nextInt();

        System.out.println("Enter the Element");
        item=sc.nextInt();

        for (i=size;i>loc;i--)
        {
            a[i]=a[i-1];
        }
        a[loc]=item;
        size++;
        System.out.println("Array Element After Inserting");
        for (i=0;i<size;i++)
        {
            System.out.println(a[i]);
        }


    }
}

class Delete_Array{
    void show17()
    {
        int i,size=0,loc;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of Array");
        size=sc.nextInt();
        int a[]=new int[size];

        System.out.println("Enter the Array Element");
        for (i=0;i<size;i++)
        {
            a[i]=sc.nextInt();
        }

        System.out.println("Enter the Location to Delete Element");
        loc=sc.nextInt();

        for (i=loc;i<size-1;i++)
        {
            a[i]=a[i+1];
        }
        size--;

        System.out.println("Array Element After Deleting");
        for (i=0;i<size;i++)
        {
            System.out.println(a[i]);
        }

    }
}
