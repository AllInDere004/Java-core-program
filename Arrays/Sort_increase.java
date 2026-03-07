import java.util.Scanner;
class Demo{
    static void reverse(int[] arr){
        int i=0,j=arr.length-1;
        while (i<j) {
            swap(arr,i,j);
            i++;
            j--;
        }
    }

    static void swap(int[] arr, int i,int j){
         int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }


    static int[] sortSquares(int[] arr){
        int n=arr.length;
        int left=0;
        int right=n-1;
        int[] ans=new int[n];
        int k=0;        // k=n-1 -- without reverse function

        while (left<=right) {
            if(Math.abs(arr[left]) > Math.abs(arr[right])){
                ans[k++]=arr[left]*arr[left];       // k-- = without reverse fn
                left++;
            }
            else{
                ans[k++]=arr[right]*arr[right];     // k-- = without reverse fn
                right--;
            }
        }
        reverse(ans);
        return ans;
    }
}
public class Sort_increase {
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

        System.out.println("Printed unsorted array elements: ");
        for(i=0;i<size;i++){
            System.out.print(a[i]+" ");
        }

        Demo ob=new Demo();
        int[] sqarr=ob.sortSquares(a);
        

        System.out.println("Printed Sorted non-decreasing array elements: ");
        for(i=0;i<size;i++){
            System.out.print(sqarr[i]+" ");
        }

    }
}
