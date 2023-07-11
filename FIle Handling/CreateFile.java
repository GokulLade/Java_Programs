                /*File Create Demo Program */

import java.io.*;

public class CreateFile {
    public static void main(String args[]) throws IOException
    {
        File f=new File("C:\\Users\\91762\\Program\\JAVA\\FIle Handling\\File.txt");
       
        if(f.createNewFile())
        {
            System.out.println("File Successfully Created....!");
        }
        else
        {
            System.out.println("File Already Exist....!");
        }
      
        
    }
}