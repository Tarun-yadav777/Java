package JavaPrograms;

import java.net.SecureCacheResponse;
import java.util.Scanner;

interface OSProcesses
{
    public void addProcess(int data);
    public int deleteProcess();
    public void show();
}
class LIFO implements OSProcesses
{
    private int top;
    int arr[] = new int[5];
    public int getTop() {
        return top;
    }
    public void setTop(int top) {
        this.top = top;
    }
    public void addProcess(int data)
    {
        if(top!=5)
        {
            arr[top]=data;
            top++;
        }
        else
            System.out.println("Can't be added cause its full");
    }
    public int deleteProcess()
    {   
        int data;
        top--;
        data=arr[top];
        if(top!=0)
            arr[top]=0;
        else
            System.out.println("Can't be removed cause its empty");
        return data;
    }
    public void show()
    {
        System.out.println("Elements");
        for(int k:arr)
        {
            System.out.print(k+" ");
        }
        System.out.println();
    }
}
class FIFO implements OSProcesses
{
    public int getFront() {
        return front;
    }

    public void setFront(int front) {
        this.front = front;
    }

    public int getrear() {
        return rear;
    }

    public void setrear(int rear) {
        this.rear = rear;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    private int front,rear,size; 
    int arr[] = new int[5];
    public void addProcess(int data)
    {
        if(size!=5)
        {
            arr[rear]=data;
            rear++;
            size++;
        }
        else
            System.out.println("can't be added cause its full");
    }
    public int deleteProcess()
    {
        int data;
        data=arr[front];
        if(size!=0)
        {
            arr[front]=0;
            front++;
            size--;
        }
        else
            System.out.println("Can't be removed cause its empty");
        return data;
    }
    public void show()
    {
        System.out.println("Elements");
        for(int k:arr)
        {
            System.out.print(k+" ");
        }
        System.out.println();
    }
}
public class EndTermQ3 {
    public static void main(String arg[])
    {
        LIFO obj = new LIFO();
        FIFO obj2 = new FIFO();
        System.out.println("Enter the five element in LIFO implementation");
        Scanner s = new Scanner(System.in);
        for(int i=0;i<5;i++)
        {
            int x = s.nextInt();
            obj.addProcess(x);
        }
        obj.show();
        System.out.println("Removed element = "+obj.deleteProcess());
        obj.show();
        System.out.println("Enter the elements for FIFO implementation");
        Scanner s1 = new Scanner(System.in);
        for(int i=0;i<5;i++)
        {
            int y = s1.nextInt();
            obj2.addProcess(y);
        }
        obj2.show();
        System.out.println("Removed element = "+obj2.deleteProcess());
        obj2.show();
    }
}
