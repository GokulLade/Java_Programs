                /* Variable Demo Program */
public class Variable {
    static int a=10;  //static var
    int b=20;        //instance var
    public static void main(String[] args) {
        int c=30;       //Local var

        Variable res=new Variable();    //Object create

        //Print all variable
        System.out.println("The Static Variable is="+Variable.a);
        System.out.println("The Instance Variable is="+res.b);
        System.out.println("The Local Variable is="+c);

        res.Show();
        res.Show();

    }
    void Show()
    {
        int d=50;
        System.out.println("The two variable is"+a+" "+d);
        ++a;
        ++d;
    }
}
