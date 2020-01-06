package JavaPrograms;

enum Mobile
{
    APPLE(1000000),SAMSUNG(40000),VIVO,OPPO(15000);
    int price;
    Mobile()
    {
        price=20000;
    }
    Mobile(int price)
    {
        this.price=price;
    }
    public int getPrice()
    {
        return price;
    }

}
public class Enum {
    public static void main(String arg[])
    {
        Mobile m[] = Mobile.values();
        for(Mobile mobile : m)
        {
            System.out.println(mobile+" price : "+mobile.getPrice());
        }
    }
}
