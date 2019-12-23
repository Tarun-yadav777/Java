package JavaPrograms;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHalndling {
    public static void main(String arg[])
    {
        try
        {
            File obj = new File("Outpur.txt");
            FileWriter obj1 = new FileWriter("Outpur.txt");
            FileReader obj2 = new FileReader("Outpur.txt");
            if(obj.createNewFile())
            {
                System.out.println("File created "+obj.getName());
            }
            else {
                System.out.println("File already exist");
                System.out.println("File Name "+obj.getName());
                System.out.println("Writable "+obj.canWrite());
                System.out.println("Readable "+obj.canRead());
                System.out.println("Length of file "+obj.length());
                System.out.println("Absolute path "+obj.getAbsolutePath());
            }
            obj1.write("Writing into file through second programme");
            obj1.close();
            System.out.println("Writing successful");
            Scanner s = new Scanner(obj2);
            System.out.print("Written content of file is : ");
            while(s.hasNextLine())
            {
                String str = s.nextLine();
                System.out.println(str);
            }
            obj2.close();
        }
        catch (IOException e)
        {
            System.out.println(e+"This exception occurred");
        }
    }
}
