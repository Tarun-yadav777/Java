package JavaPrograms;

public class NoEqualSum {
    public static void main(String ag[])
    {
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        pairSum(arr,4);

    }
    public static void pairSum(int[] arr,int sum)
    {
        for(int i=0;i<arr.length;i++)
        {
            int first=arr[i];
            for(int j=i+1;j<arr.length;j++)
            {
                int second=arr[j];
                if((first+second)==sum)
                    System.out.println("Given sum = "+sum+" no's "+"("+first+","+second+")");
            }
        }
    }
}
