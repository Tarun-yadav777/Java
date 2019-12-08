package JavaPrograms;

class Array1{
    public int sumarray(int ...n){
        int c=0,avg=0,sum=0;
        for(int k:n){
            sum+=k;
            c++;
        }
        avg=sum/c;
        System.out.println("Sum="+avg);
        return avg;
    }
}
public class Array {
    public static void main(String arg[]){
//
//        a[0]=0;
//        a[1]=1;
//        a[2]=2;
//        a[3]=3;
//        a[4]=4;
        Array1 obj = new Array1();
        obj.sumarray(1,2,3,4,5,6,6,7);
    }
}
