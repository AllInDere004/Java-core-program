import java.util.Scanner;
class Demo_sort{
    // static void SortZeros(int[] arr){
    //     int n=arr.length;
    //     int z=0;
    //     // count numbers of zeros
    //     for(int i=0;i<n;i++){
    //         if(arr[i]==0){
    //             z++;
    //         }
    //     }

    //     // 0 to z-1 : 0, zero to n-1 : 1
    //     for(int i=0;i<n;i++){
    //         if(i<z){
    //             arr[i]=0;
    //         }
    //         else{
    //             arr[i]=1;
    //         }
    //     }
    // }

    /*Swapping Method */
    static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    static void sortZeroAndOne(int[] arr){
        int n = arr.length;
        int left=0;int right=n-1;

        while ((left<right)) {
            if(arr[left] == 1 && arr[right]==0) {
                swap(arr, left, right);
                left++;
                right--;
            }
            if(arr[left]==0){
                left++;
            }
            if(arr[right]==1){
                right--;
            }
        }

    }
}
public class Sorting_Zero_One {
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

        Demo_sort ob=new Demo_sort();
        
        // ob.SortZeros(a);
        
        ob.sortZeroAndOne(a);
        
        System.out.println("Printed array elements: ");
        for(i=0;i<size;i++){
            System.out.print(a[i]+" ");
        }


    }    
}
