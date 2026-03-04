import java.util.Scanner;

public class Pref_Sufx_Partition {

    static void PrintArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static int Array_Sum(int[] arr){
        int total_sum=0;
        for(int i=0;i<arr.length;i++){
            total_sum += arr[i];
        }
        return total_sum;
    }

    static boolean equalSumPartition(int[] arr){
        int total_sum=Array_Sum(arr);

        int prefSum=0;
        for(int i=0;i<arr.length;i++){
            prefSum += arr[i];

            int suffixSum = total_sum - prefSum;
            if(suffixSum == prefSum){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
         int size,i;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Size of array: ");
        size=sc.nextInt();
        int a[]=new int[size];

        System.out.println("Enter the array elements: ");
        for(i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Input Array: ");
        PrintArray(a);

        System.out.println("Equal Partition Possible: " + equalSumPartition(a));
    }
}
