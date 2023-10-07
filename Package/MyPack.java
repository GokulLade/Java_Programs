                /* Create User-Define Package Demo Program */
package Gokul;

import java.util.*;

public class MyPack {
    public void add()
    {
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the First Number");
        a=sc.nextInt();

        System.out.println("Enter the Second Number");
        b=sc.nextInt();

        System.out.println("Addition of two number is="+(a+b));
    }
    
}

/*To create Package write command = javac -d . class_name.java */
/*To run program write command = java package_name.class_name */
