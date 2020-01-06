package JavaPrograms;

class SingleInstance
{
    static SingleInstance obj ;
    private SingleInstance()
    {
        System.out.println("INSTANCE created");
    }
    public static SingleInstance createInstance()
    {
        if(obj==null)
            obj = new SingleInstance();
        return obj;
    }
}
public class Singelton {
    public static void main(String arg[])
    {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                SingleInstance obj = SingleInstance.createInstance();
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                SingleInstance obj2 = SingleInstance.createInstance();
            }
        });
        t1.start();
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();
    }
}
