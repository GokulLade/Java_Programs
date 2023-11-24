                /*File Information methods Demo Program*/

import java.io.*;

public class FileInfo {
    public static void main(String[] args)
    {
        File f=new File("C:\\Users\\91762\\Program\\JAVA\\FIle Handling\\File.txt");
        if(f.exists())
        {
            System.out.println("The File Name is : "+f.getName());
            System.out.println("File Location: "+f.getAbsolutePath());
            System.out.println("File is Readable: "+f.canRead());
            System.out.println("File is Writeable: "+f.canWrite());
            System.out.println("File Size in byte: "+f.length());
            System.out.println("Remove File: "+f.delete());

        }
        else
        {
            System.out.println("File doesn't Exist...! ");
        }
        
    }
    
}
