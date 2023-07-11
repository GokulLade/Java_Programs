                /*Compile time Polymorphism using Method Overloading Program */
class MethodOver{
    void add()
    {
        int a=10,b=20;
        int c=a+b;
        System.out.println("The Addition is ="+c);
    }

    void add(int x,int y)
    {
        System.out.println("The Addition is="+(x+y));
    }

    int add(int a,int b,int c)
    {
        int d=a+b+c;
        return d;
    }

    public static void main(String[] args)
    {
        MethodOver m=new MethodOver();
        m.add();
        m.add(23,12);
        int e=m.add(12,32,13);
        System.out.println("The Addition is="+e);
        
    }
}
