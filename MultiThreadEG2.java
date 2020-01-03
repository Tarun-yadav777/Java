package JavaPrograms;

class X extends Thread
{
 public void show()
 {
     System.out.println("HI");
 }
 public void run()
 {
     show();
     try {
         Thread.sleep(1000);
     } catch (InterruptedException e) {
         e.printStackTrace();
     }

 }

}
public class MultiThreadEG2 {
    public static void main(String arg[])
    {
        X obj = new X();
        obj.start();
    }
}
