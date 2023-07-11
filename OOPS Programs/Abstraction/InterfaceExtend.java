                /*Interface extends Demo program */

class InterfaceExtend{
    public static void main(String[] args)
    {
        Om r=new AddSub();
        r.add();
        r.sub();
        
    }
}
interface Ram{
   
    void add();
}
interface Om extends Ram{   //Extends interface
     
    void sub();
}
class AddSub implements Om{
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
