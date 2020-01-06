package JavaPrograms;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface MyPHoneInfo
{
    String os() default "Symbian";
    int version() default 0;
}
@MyPHoneInfo(os = "Android",version = 9)
class MyPhonedata
{
    @Override
    public String toString() {
        return "MyPhonedata{" +
                "company='" + company + '\'' +
                ", Model='" + Model + '\'' +
                ", android_version='" + android_version + '\'' +
                ", screen_size=" + screen_size +
                '}';
    }

    String company;
    String Model;
    String android_version;
    int screen_size;
    public MyPhonedata(String company, String model, String android_version, int screen_size)
    {
        this.company = company;
        Model = model;
        this.android_version = android_version;
        this.screen_size = screen_size;
    }
}
public class CustomAnnotation {
    public static void main(String arg[])
    {
        MyPhonedata obj = new MyPhonedata("Samsung","J8","PIE",6);
        Class c = obj.getClass();
        Annotation an = c.getAnnotation(MyPHoneInfo.class);
        MyPHoneInfo m = (MyPHoneInfo)an;
        System.out.println("Operating system = "+m.os()+" : "+" version = "+m.version());
        System.out.println(obj);
    }
}
