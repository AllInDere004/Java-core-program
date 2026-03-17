public class Selection_Sort {
    static void sort(int[] arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            // find minimum element in unsorted part of array
            int min_index=i;
            for(int j=i+1;j<n;j++){
                if(arr[j] < arr[min_index]){
                    min_index=j;
                }
            }
            // swap current element & minimum element
            if(min_index != i){
                int temp=arr[i];
                arr[i]=arr[min_index];
                arr[min_index]=temp;
            }
        }
    }

    public static void main(String[] args) {
        int arr[]={7,4,1,5,2};
        sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
