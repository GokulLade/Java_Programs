                /*File Copy Demo Program */
import java.io.*;

public class FileCopy {
    public static void main(String[] args)throws IOException
    {
        File fc=new File("A.txt");
        FileInputStream r=new FileInputStream(f);

        File fw=new File("B.txt");
        FileOutputStream w=new FileOutputStream(fw);

        int i;
        while((i=r.read())!= -1)
        {
            w.write((char)i);
        }

        System.out.println("Successfully Copy Data");
        
    }
    
}
