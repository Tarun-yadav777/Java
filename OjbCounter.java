package JavaPrograms;

class Demo
{
    static int c;
    public Demo()
    {
      c++;
    }
    public void show()
    {
        System.out.println(" Count = "+c);
    }
}
public class OjbCounter {
    public static void main(String arg[])
    {
        Demo o = new Demo();
        Demo o1 = new Demo();
        Demo o2 = new Demo();
        o.show();


    }
}
