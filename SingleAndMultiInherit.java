package JavaPrograms;

class SuperClass{
    int a,b,c,d,e,f;
    public SuperClass()
    {
        a=5;
        b=6;
        c=7;
    }
    public int add()
    {
        d=a+b;
        return d;

    }
    public int sub()
    {
        e=c-b;
        return e;
    }

}
class SubClass extends SuperClass {
    public int multi() {
        f = a * b * c;
        return f;
    }
}
class SubSubclass extends SubClass{
    public void show()
    {
        if(f>=210)
            System.out.println("Your Result Is Fine");
        else
            System.out.println("wrong");
    }

}
public class SingleAndMultiInherit {
    public static void main(String arg[])
    {
        SubSubclass obj = new SubSubclass();
        System.out.println(obj.add());
        System.out.println(obj.sub());
        System.out.println(obj.multi());
        obj.show();

    }
}
