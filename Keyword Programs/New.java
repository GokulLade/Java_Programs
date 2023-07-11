                /*Using Final keyword Demo Program */

import java.util.Scanner;

class New{
    public static void main(String[] args)
    {
        NewVar n=new NewVar();
        n.show();
        System.out.println(n.a); //For instance Variable

        NewConstructor n1=new NewConstructor(); //For Constructor

        NewArray n2=new NewArray();
        n2.Array();


        
    }
}

                 /* New keyword for instance variable */
class NewVar{
    int a=10;
    static void show()
    {
        //System.out.println(a);
    }
}

                /* New keyword for Constructor*/
class NewConstructor{
    NewConstructor()
    {
        System.out.println("Constructor is Call");
    }
}

                 /* New keyword for Array*/
class NewArray{
    void Array()
    {
        int size;
        System.out.println("Enter the size of Array");
        Scanner sc=new Scanner(System.in);
        size=sc.nextInt();
        int a[]=new int[size]; //for array 
        
        System.out.println("Enter the Array Element");
        for(int i=0;i<size;i++)
        {
            a[i]=sc.nextInt();
        }

        System.out.println("Array Element are");
        for (int b : a)
        {
            System.out.println(b);
            
        }
    }
}