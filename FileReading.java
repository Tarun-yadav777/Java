package JavaPrograms;

import java.io.FileReader;

public class FileReading {
    public static void main(String arg[])
    {
        int ch=0;
        FileReader fr=null;
        try
        {
            fr = new FileReader("C:\\Users\\tarun\\IdeaProjects\\JavaPrograms\\Outpur");
            while (ch!=-1)
            {
                ch=fr.read();
                System.out.print(ch);
            }
            fr.close();
        }
        catch (Exception e)
        {
            System.out.println("File not found");
        }

    }
}
