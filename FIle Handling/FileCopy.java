                /*File Copy Demo Program */

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
    public static void main(String[] args)throws IOException
    {
        FileInputStream r=new FileInputStream("C:\\Users\\91762\\Program\\JAVA\\FIle Handling\\File.txt");
        FileOutputStream w=new FileOutputStream("C:\\Users\\91762\\Program\\JAVA\\FIle Handling\\Files.txt");

        int i;
        while((i=r.read())!= -1)
        {
            w.write((char)i);
        }

        System.out.println("Successfully Copy Data");
        
    }
    
}
