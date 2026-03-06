import java.util.Scanner;

public class Range_Query {

    static void PrintArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static int[] makePrefixSum(int[] arr){
        int n=arr.length;
        for(int i=1;i<arr.length;i++){
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

        int[] prefSum=makePrefixSum(a);

        System.out.println("Enter number of queries: ");
        int q=sc.nextInt();

        while (q-- > 0) {
            System.out.println("Enter Range: ");
            int l=sc.nextInt();
            int r=sc.nextInt();

            int ans;
            if(l==0){
                ans=prefSum[r];
            } else{
                ans=prefSum[r]-prefSum[l-1];
            }

            System.out.println("Sum: " + ans);
            
        }

    }
}
