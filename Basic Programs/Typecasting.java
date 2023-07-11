                /* Typecasting Demo Program */
 public class Typecasting {
     public static void main(String[] args) {
         /* Implicit Typecasting */

         int a = 10;
         double b = a;

         System.out.println(b);

         Explicit e1= new Explicit();
         e1.Show();
     }
 }
 class Explicit {
    void Show()
    {
        /* Explicit Typecasting */

        double a=10.5;
        int b=(int)a;
        System.out.println(b);
    }

 }



