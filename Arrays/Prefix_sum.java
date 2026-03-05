import java.util.Scanner;

public class Prefix_sum {

    static void PrintArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static int[] makePrefixSum(int[] arr){
        int n=arr.length;
        // int[] pref = new int[n];        // // with another array
        // pref[0]=arr[0];

        for(int i=1;i<n;i++){
            arr[i]=arr[i-1]+arr[i];
        }
        return arr;
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

        // int[] pref=makePrefixSum(a);
        // PrintArray(pref);

    }
}
