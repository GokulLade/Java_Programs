                /* Interface Demo Program */
import java.util.Scanner;
public class Interface {
    public static void main(String[] args)
    {
        Om1 o=new Om1();
        o.input();
        System.out.println("**************************************************************************");
        o.output();
        System.out.println("**************************************************************************");
        
    }
}

interface Clint{
    void input();//public and abstract
    void output();//public and abstract
}
class Om1 implements Clint{
    String name; double Sal;
    public void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the user Name=");
        name=sc.nextLine();

        System.out.println("Enter the salary=");
        Sal=sc.nextDouble();

    }

    public void output()
    {
        System.out.println("User Name is="+name);
        System.out.println("Salary is="+Sal);
    }
}
