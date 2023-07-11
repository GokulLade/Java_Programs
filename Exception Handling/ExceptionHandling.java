                /*Exception Handling using try and catch block Demo program */

import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String args[])
    {
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the First Number");
        a=sc.nextInt();
        System.out.println("Enter the Second Number");
        b=sc.nextInt();
        
        //if Second number is 0 then Exception occur
        try
        {
            c=a/b;
            System.out.println("Answer= "+c);
        }
        //Arithmetic Exception 
        catch(Exception e)
        {
            System.out.println(a+" is not divided by "+b);
        }
    }
    
}
