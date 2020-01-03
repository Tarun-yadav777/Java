package JavaPrograms;

class Nerds
{
    int Sno;
    String Name;
    String Hobby;

    public Nerds(int sno, String name, String hobby) {
        Sno = sno;
        Name = name;
        Hobby = hobby;
    }

    @Override
    public String toString() {
        return "Nerds{" +
                "Sno=" + Sno +
                ", Name='" + Name + '\'' +
                ", Hobby='" + Hobby + '\'' +
                '}';
    }
}
public class toString {
    public static void main(String arg[])
    {
        Nerds obj = new Nerds(1,"Rahul","Anime freak");
        System.out.println(obj);
        Nerds obj2 = new Nerds(2,"Dhruv","Manga reader");
        System.out.println(obj2);
        Nerds obj3 = new Nerds(3,"Kanishk","Drugs");
        System.out.println(obj3);
    }
}
