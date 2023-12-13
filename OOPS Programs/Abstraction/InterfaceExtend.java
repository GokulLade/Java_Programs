                /*Interface extends Demo program */

class InterfaceExtend{
    public static void main(String[] args)
    {
        Om2 r=new AddSub();
        r.add();
        r.sub();
        
    }
}
interface Ram1{
   
    void add();
}
interface Om2 extends Ram1{   //Extends interface
     
    void sub();
}
class AddSub implements Om2{
    int a=10; int b=20;
    @Override
    public void add()
    {
        System.out.println("The addition of two number is="+(a+b));
    }
    @Override
    public void sub()
    {
        System.out.println("The Subtraction of two number is="+(a-b));
    }
}
