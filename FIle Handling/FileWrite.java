                /*In file Write a Data Demo Program */

import java.io.*;

public class FileWrite {
    public static void main(String[] args)
    {
        
        try
        {
            FileWriter f=new FileWriter("C:\\Users\\91762\\Program\\JAVA\\FIle Handling\\File.txt");
            
            try
            {
                 f.write("Java Program Add two number:");
            }
            finally
            {
                f.close();
            }
            System.out.println("Successfully Data wrote in File");
        }
        catch(IOException i)
        {
            System.out.println(i);
        }
    }
    
}
