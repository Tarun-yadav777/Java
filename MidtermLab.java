package JavaPrograms;

public class MidtermLab {
    public static void main(String arg[]){
        String s = "tarun";
        char c[] = s.toCharArray();
        char temp = c[4];
        c[4]=c[3];
        c[3]=temp;
        String s1 = new String(c);
        System.out.println("orignal string "+s);
        System.out.println("Swapped string "+s1);

    }
}
