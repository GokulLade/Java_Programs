                /* Read Data from file */

import java.io.*;
import java.util.Scanner;

public class FileRead {
    public static void main(String[] args) 
    {
        
        Dis(); //Function calling
        
        //First type to read Data from file
        try
        {
            FileReader r=new FileReader("C:\\Users\\91762\\Program\\JAVA\\FIle Handling\\File.txt");
            try
            {
                int i;
                while((i=r.read())!= -1)
                {
                    System.out.print((char)i);
                }
            }
            finally
            {
                r.close();
            }
        }
        catch(IOException i)
        {
            System.out.println(i);
        }
        
  }

   
  //Second type to read Data from file
    
  public static void Dis()
    {
        try
        {
            File f=new File("C:\\Users\\91762\\Program\\JAVA\\FIle Handling\\File.txt");
            Scanner sc=new Scanner(f);

            while(sc.hasNextLine())
            {
                System.out.println(sc.nextLine());
            }
        }

        catch(IOException e)
        {
            System.out.println(e);
        }
      
    }
    
}

