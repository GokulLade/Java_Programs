                /*ArrayDeque class Methods Using Demo Program */

import java.util.ArrayDeque;

public class Queue_1 {
    public static void main(String[] args)
    {
        ArrayDeque<String> Name=new ArrayDeque();         //First in First Out(LIFO)
        
        Name.add("Gokul");          //To add element in Queue
        Name.add("Vishal");
        Name.add("Aniket");
        System.out.println(Name);

        Name.remove();         //Remove Element in Queue
        System.out.println(Name);
        
    }
    
}
