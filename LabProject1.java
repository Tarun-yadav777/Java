
package labproject1;
import java.util.Scanner;


public class LabProject1 {

    public static void main(String[] args) {
        System.out.println("Enter the String= ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char arr[] = s.toCharArray();
        char temp = arr[s.length()-1];
        arr[s.length()-1]=arr[s.length()-2];
        arr[s.length()-2]=temp;
        String ns = new String(arr);
        System.out.println("Orignal string= "+s);
        System.out.println("New string= "+ns);
    }
    
}
