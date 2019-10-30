package JavaPrograms;
class Single{
    int x,r,sum;
    public Single(int x)
    {
        this.x = x;
        sum=0;
    }
    public void makeSingle()
    {
        while(x!=0 || sum>9)
        {
            if (x == 0) {
                x = sum;
                sum = 0;
            }
            r=x%10;
            sum=sum+r;
            x=x/10;
        }
        System.out.println(sum);
    }
}
public class Midq2 {
    public static void main(String arg[])
    {
        Single obj = new Single(542);
        obj.makeSingle();
    }
}
