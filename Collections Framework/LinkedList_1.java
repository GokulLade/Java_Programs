                /*LinkedList class Methods Using Demo Program */

import java.util.LinkedList;

public class LinkedList_1 {
    public static void main(String[] args) 
    {
        LinkedList<String> Name=new LinkedList<String>();
        Name.add("Gokul");          //To add element in LinkedList
        Name.add("Vishal");
        Name.add("Aniket");
        System.out.println(Name);

        Name.addFirst("Ganesh");        //To add First Element in LinkedList
        Name.addLast("Shreyash");       //To add Last Element in LinkedList
        System.out.println(Name);
        
        Name.add(3,"Ram");              //Set position to add Element in LinkedList
        System.out.println(Name);

        Name.remove();       //To remove First Element
        System.out.println(Name);

        Name.remove(1);       //Set position to remove Element in LinkedList
        System.out.println(Name);

        Name.removeFirst();        //To remove First Element in LinkedList
        Name.removeLast();       //To remove Last Element in LinkedList
        System.out.println(Name);

        for (String str : Name)     //Print Element using for-each loop
        {
            System.out.println(str);   
        }
    }
    
}
