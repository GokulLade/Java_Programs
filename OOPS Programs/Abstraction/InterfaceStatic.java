                 /* In Interface Static method Demo Program (JDK 1.8) */

interface InterfaceStatic {
    public static void main(String args[])
    {
        show.disp();

    }
}
interface show {
    static void disp()
    {
        System.out.println("Static method can not implements ");
    }
}