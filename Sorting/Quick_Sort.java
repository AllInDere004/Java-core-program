public class Quick_Sort {
     static void displayArr(int[] arr){
        for(int val:arr){
            System.out.print(val + " ");
        }
    }
    static void swap(int[] arr,int x,int y){
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }
    static int partition(int[] arr, int st,int end){
        int pivot=arr[st];
        int i;
        int count=0;
        for(i=st+1;i<=end;i++){
            if(arr[i] <= pivot) count++;
        }

        int pivotIdx=st+count;
        swap(arr,st,pivotIdx);
        i=st;
        int j=end;
        while(i<pivotIdx && j>pivotIdx){
            while(arr[i]<=pivot) i++;
            while(arr[j] > pivot) j--;
            if(i<pivotIdx && j>pivotIdx){
                swap(arr,i,j);
                i++;
                j--;
            }
        }
        return pivotIdx;
    }
    static void quicksort(int[] arr,int st,int end){
        if(st>=end) return;
        int pi=partition(arr, st, end);
        quicksort(arr, st, pi-1);
        quicksort(arr, pi+1, end);
    }

    public static void main(String[] args) {
        int[] arr={6,3,1,5,4,2,10,8,7,9};
        int n=arr.length;
        System.out.print("Array before sorting: ");
        displayArr(arr);
        System.out.println();
        quicksort(arr, 0, n-1);
        System.out.print("array after sorting: ");
        displayArr(arr);
    }
}
