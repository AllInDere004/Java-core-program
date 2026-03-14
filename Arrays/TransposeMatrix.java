import java.util.Scanner;

public class TransposeMatrix {

    static void printMatrix(int[][] matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[][] findtranspose(int[][] arr,int r,int c){
        int[][] ans=new int[c][r];

        for(int i=0;i<c;i++){
            for(int j=0;j<r;j++){
                ans[i][j]=arr[j][i];
            }
        }
        return ans;
    }

    // only applicable for square matrix
    static void transposeInPlace(int[][] matrix,int r,int c){

        for(int i=0;i<c;i++){
            for(int j=i;j<r;j++){
                // swap
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows and columns: ");
        int r=sc.nextInt();
        int c=sc.nextInt();
        int[][] matrix=new int[r][c];
        int totalelements=r*c;
        System.out.println("Enter "+ totalelements + " values: ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("Input Matrix: ");
        printMatrix(matrix);

        transposeInPlace(matrix, r, c);
        System.out.println("Transpose of Matrix: ");
        printMatrix(matrix);
        // int[][] ans=findtranspose(matrix, r, c);
        // printMatrix(ans);
    }
    
}
