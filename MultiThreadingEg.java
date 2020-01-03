package JavaPrograms;

class Sum implements Runnable
{   int x,y,sum;
    public Sum(int x,int y)
    {
        this.x=x;
        this.y=y;
    }
    @Override
    public void run()
    {
        sum=x+y;
        System.out.println("Sum : "+sum);
    }
}
class Product implements Runnable
{
    int x,y,mult=1;

    public Product(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void run()
    {
        mult=x*y;
        System.out.println("Mult : "+mult);
    }
}

public class MultiThreadingEg {
    public static void main(String arg[])
    {
        Sum obj1 = new Sum(1,2);
        Thread t1 = new Thread(obj1);
        t1.start();

        Product obj2 = new Product(1,2);
        Thread t2 = new Thread(obj2);
        t2.start();

    }
}
