package JavaPrograms;

import java.util.Scanner;

public class ExeptionHandling {
    public static void main(String arg[])
    {
        int i,j,k;
        System.out.println("Enter the 1st no");
        Scanner s = new Scanner(System.in);
        i=s.nextInt();
        System.out.println("Enter the 2nd no");
        Scanner s1= new Scanner(System.in);
        j=s1.nextInt();
        try
        {
            k=i/j;
            System.out.println("Value : "+k);
            throw  new MeriExeption();
        }
        catch (ArithmeticException e)
        {
            System.out.println("Second no u entering is no gud 4 ur maths");
        }
        catch (Exception e)
        {
            System.out.println("Something wrong happen there ");
        }
        finally
        {
            System.out.println("Saionara~");
        }
    }
}

class MeriExeption extends Exception
{
    public MeriExeption()
    {
        System.out.println("meri exeption is been created");
    }
}