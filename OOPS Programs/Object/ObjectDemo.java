                  /* Object Demo Program */
class ObjectDemo {
    public static void main(String args[])
    {
        Show s=new Show();  //object created

        Show2 s2=new Show2();
        s2.show();      //Function calling
    }    
}
class Show
{
    {
        System.out.println("Object Demo Program");
    }
}
class Show2
{
    void show()
    {
        System.out.println("Object Demo Program with function calling");

    }
}