import java.util.Scanner;
class Demo{
    static void swap(int[] arr, int i,int j){
         int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    static void sortbyParity(int[] arr){
        int n=arr.length;
        int left=0;
        int right=n-1;
        while (left<right) {
            if(arr[left] % 2 == 1 && arr[right] % 2 == 0){
                swap(arr, left, right);
                left++;
                right--;
            }   
            if(arr[left]%2==0){
                left++;
            }         
            if(arr[right]%2==1){
                right--;
            } 
        }

    }
}

public class Sort_Parity {
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

        Demo ob=new Demo();
        ob.sortbyParity(a);

        System.out.println("Printed array elements: ");
        for(i=0;i<size;i++){
            System.out.print(a[i]+" ");
        }
    }
}
