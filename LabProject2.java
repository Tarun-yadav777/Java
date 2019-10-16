

package labproject2;
import java.util.Scanner;

class Triple{
    int count;
    public Triple(){
        count=0;
    }
    public int countChar(){
    System.out.println("Enter the String= ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char arr[] = s.toCharArray();
        for(int i=0;i<s.length()-3;i++){
            if(arr[i]==arr[i+1] && arr[i]==arr[i+2]){
                count++;
            }
            
        }
        return count;
    }
}

public class LabProject2 {

    public static void main(String[] args) {
        Triple obj = new Triple();
        System.out.println("Count= "+obj.countChar());
        
    }
    
}
