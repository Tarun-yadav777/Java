package JavaPrograms;

import java.io.FileWriter;

public class FileWritting {
    public static void main(String arg[])
    {
        try
        {
            String str="This is the first program of file handling(writing into a file)";
            FileWriter fw = new FileWriter("Outpur.txt");
            for(int i=0;i<str.length();i++)
                fw.write(str.charAt(i));
            System.out.println("Writing successful");
            fw.close();
        }
        catch (Exception e)
        {
            System.out.println("We found this error"+e);
        }
    }
}
