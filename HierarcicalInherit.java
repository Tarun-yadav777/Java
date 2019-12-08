package JavaPrograms;

class SuperClass12 {
    int a, b, c, d, e, f;

    public SuperClass12() {
        a = 5;
        b = 6;
        c = 7;
    }

    public int add() {
        d = a + b;
        return d;

    }

    public int sub() {
        e = c - b;
        return e;
    }

    public int multi() {
        f = a * b * c;
        return f;
    }

    public void show() {
        if (f >= 210)
            System.out.println("Your Result Is Fine");
        else
            System.out.println("wrong");
    }
}
class SubClass1 extends  SuperClass{
    public void display()
    {
        System.out.println("Addition="+d+":"+"Subtraction="+e+":"+"Multiplication"+f);
    }

}
class SubClass2 extends SuperClass{
    public void display1()
    {
        System.out.println("program worked");
    }
}
public class HierarcicalInherit {
    public static void main(String arg[]) {
        SubClass1 obj = new SubClass1();
        SubClass obj3 = new SubClass();
        SubClass2 obj1 = new SubClass2();
        System.out.println(obj.add());
        System.out.println(obj.sub());
        System.out.println(obj3.multi());

        obj.display();
        obj1.display1();
    }
}
