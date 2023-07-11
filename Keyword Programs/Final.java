                /*Using Final keyword Demo Program */
class Final{
    public static void main(String[] args)
    {
        FinalVar f=new FinalVar();
        f.show();

        FinalMethod_1 f1=new FinalMethod_1();
        f1.Name();
        f1.M_Number();

        FinalCLass f2=new FinalCLass();
        f2.My_Number();
        f2.Atm_Pin();
        //f2.Account_Type();
        
    }
}

                /* Final keyword for variable */
class FinalVar{
    void show()
    {
        final int a=10;
        System.out.println(a);
        // a=30; Not Possible
        System.out.println(a);
    }
}
                /* Final keyword for Method */
class FinalMethod{
    void Name()
    {
        System.out.println("Gokul Lade");
    }
    final void M_Number()
    {
        System.out.println("7432190432");
    }
} 
class FinalMethod_1 extends FinalMethod{
    @Override
    void Name()
    {
        System.out.println("Shreyas Dabke");
    }
    /*@Override                //Not possible
    void M_Number()
    {
        System.out.println("7546654321");
    }*/
} 

                /* Final keyword for Class */
final class FinalCLass{
    void My_Number()
    {
        System.out.println("9654350921");
    }
    void Atm_Pin()
    {
        System.out.println("8778");
    }
}

/*class FinalCLass_1 extends FinalCLass{           //Not possible
    void Account_Type()
    {
        System.out.println("Saving");
    }
}*/
