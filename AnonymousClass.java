package JavaPrograms;

interface Anonymous
{
     void show();
}
public class AnonymousClass {
    public static void main(String arg[])
    {
        Anonymous obj = new Anonymous() {
            @Override
            public void show() {
                System.out.println("This is Anonymous Inner Class Regards!! ");
            }
        };
        obj.show();
    }
}
