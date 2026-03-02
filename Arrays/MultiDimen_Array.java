import java.util.Scanner;

public class MultiDimen_Array {
    
    static void printArray(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter number of rows: ");
        int r=sc.nextInt();
        System.out.println("Enter number of columns: ");
        int c=sc.nextInt();
        
        int[][] arr = new int[r][c];    // row initialize is mandatory but columnis not
        
        System.out.println("Enter" + r*c + "Elements: ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }
       // int[][] arr2 = {{1,2,3},{4,5,6},{7,8,9}};

        printArray(arr);
    }
}
