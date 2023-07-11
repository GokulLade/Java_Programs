                /*Stack class Methods Using Demo Program */

import java.util.Stack;

public class Stack_1 {
    public static void main(String[] args)
    {
        Stack<String> Name=new Stack();         //Last in First Out(LIFO)
        
        Name.push("Gokul");          //To add element in Stack
        Name.push("Vishal");
        Name.push("Aniket");
        System.out.println(Name);

        Name.pop();         //Remove Element in Stack
        System.out.println(Name);
        
    }
}
