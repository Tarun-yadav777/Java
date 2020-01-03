package JavaPrograms;

class ABC extends Thread
{
    public void show()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("hi");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public void run()
    {
        show();
    }
}


public class MultiThreading {
    public static void main(String arg[])
    {
        ABC obj1 = new ABC();
        obj1.start();


        Runnable r = new Runnable()
        {
            @Override
            public void run()
            {
                for(int i=0;i<5;i++)
                {
                    System.out.println("hello");
                    try {
                        Thread.sleep(1001);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        Thread t = new Thread(r);
        t.start();
    }
}
