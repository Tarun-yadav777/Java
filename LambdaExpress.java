package JavaPrograms;

interface LambdaExpression
{
    public void show();
}
public class LambdaExpress {
    public static void main(String arg[])
    {
        LambdaExpression obj = () -> System.out.println("Hello from Lambda Expression");
        obj.show();
    }
}
