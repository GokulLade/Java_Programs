import java.io.File;

public class FileRename{
    public static void main(String[] args) 
    {
        File f=new File("C:\\Users\\91762\\Program\\JAVA\\FIle Handling\\Files.txt");
        File r=new File("C:\\Users\\91762\\Program\\JAVA\\FIle Handling\\File.txt");

        if(f.exists())
        {
            System.out.println(f.renameTo(r));
        }
        else
        {
            System.out.println("File Not Found...!");
        }
        
    }

}