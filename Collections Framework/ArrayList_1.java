                /*ArrayList class Methods using Demo Program*/
import java.util.ArrayList;

public class ArrayList_1{
    public static void main(String[] args) 
    {
        ArrayList<String> Name=new ArrayList<String>();
        Name.add("Gokul");          //To add element in array
        Name.add("Vishal");
        Name.add("Aniket");
        System.out.println(Name);
        
        Name.add(1,"Lade");         //To add element in position of array
        System.out.println(Name);

        Name.remove(1);         //To Remove one element in array
        System.out.println(Name);

        Name.set(1,"Shreyash");          //To set element in array
        System.out.println(Name);

        System.out.println(Name.get(0));    //Print only one Element from Array

        Name.clear();           //Clear all data from Array
        System.out.println(Name);
    }
}