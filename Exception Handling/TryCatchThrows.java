            /*Using try-catch throws Exception Handling */
class TryCatchThrows{

    public static void show()throws InterruptedException
    {
        for(int i=1;i<11;i++)
        {
            System.out.println(i);
            Thread.sleep(1000);
        }
    }
    public static void main(String[] args) 
    {
        try
        {
            show();
            System.out.println(10/0);
        }
        catch(Exception e)
        {
            System.out.println("Exception in Main Method");
        }
        System.out.println("Main Method Ended");
        
    }
    
}
