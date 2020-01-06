package JavaPrograms;

enum Sinlgeton
{
    INSTANCE;
    int i;
    public void show()
    {
        System.out.println(i);
    }
}
public class SingletonWithEnum {
    public static void main(String arg[])
    {
        Sinlgeton obj = Sinlgeton.INSTANCE;
        obj.i=1;
        obj.show();
        Sinlgeton obj2 = Sinlgeton.INSTANCE;
        obj2.i =2;
        obj2.show();
    }
}
