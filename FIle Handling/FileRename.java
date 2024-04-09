import java.io.File;

public class FileRename{
    public static void main(String[] args) 
    {
        File f1=new File("C:\\Users\\91762\\Program\\JAVA\\FIle Handling\\Files.txt");
        File f2=new File("C:\\Users\\91762\\Program\\JAVA\\FIle Handling\\File.txt");

        if(f1.exists())
        {
            System.out.println(f1.renameTo(f2));
        }
        else
        {
            System.out.println("File Not Found...!");
        }
        
    }

}
