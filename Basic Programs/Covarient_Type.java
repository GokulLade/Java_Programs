                /* Covarient Return Type Demo Program */
class Covarient_Type{
    public static void main(String[] args) 
    {
        Dis d=new Dis_1();
        d.Show();
        
    }
}
class Dis{
    Dis Show()              //Return type is class
    {
        System.out.println("Dis Class");
        return this;
    }
}
class Dis_1 extends Dis{
   
    @Override
    Dis_1 Show()            //Return type is class
    {
        super.Show();
        System.out.println("Dis1 class");
        return this;
    }
}