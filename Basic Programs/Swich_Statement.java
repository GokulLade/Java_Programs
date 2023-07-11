                /*Using Switch Statement Demo Program */
import javax.swing.text.html.parser.Entity;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Swich_Statement {
    public static void main(String[] args) {
        int a,b, ch=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the First Number");
        a=sc.nextInt();
        System.out.println("Enter the Second Number");
        b=sc.nextInt();

        System.out.println("********************");
        System.out.println("1.Addition \n2.Subtraction\n3.Multiflication\n4.Division\n5.Mod");
        System.out.println("********************");
        System.out.println("Enter your Choice");
        try
        {
            ch=sc.nextInt();
        }
        catch(InputMismatchException e)
        {
            System.out.println("Please Enter Numerical Value Between 1 to 5");
        }

        switch (ch)
        {
            case 1:
                System.out.println("The Addition is="+(a+b));
                break;

            case 2:
                System.out.println("The Subtraction is="+(a-b));
                break;

            case 3:
                System.out.println("The Multiplication is="+(a*b));
                break;

            case 4:
                System.out.println("The Division is="+(a/b));
                break;

            case 5:
                System.out.println("The Mod is="+(a%b));
                break;

            default:
                System.out.println("Invalid Input");

        }

    }
}
