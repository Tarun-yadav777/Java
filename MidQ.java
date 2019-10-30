package JavaPrograms;
class Largest{
    String arr[] = new String[]{
            "earth",
            "catastrophic",
           "earthquake",
            "sports",
            "fly",
            "macahine",
            "extraordinarymachine",

                               };
    String temp = arr[0];

    public String large()
    {

        for(int i=0;i<(arr.length);i++)
        {
            if(temp.length()<arr[i].length())
                temp=arr[i];
        }
        return temp;
    }

}
public class MidQ {
    public static void main(String arg[])
    {
        Largest obj = new Largest();
        System.out.println("Largest word = "+obj.large());
    }
}
