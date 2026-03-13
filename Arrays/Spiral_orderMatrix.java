import java.util.Scanner;

public class Spiral_orderMatrix {

    static void printMatrix(int[][] matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void spiralOrder(int[][] matrix,int r,int c){
        int tr=0,br=r-1,lc=0,rc=c-1;
        int total_ele=0;
        while (total_ele < r*c) {
            // tr=lc to rc
            for(int j=lc;j<=rc && total_ele<r*c;j++){
                System.out.println(matrix[tr][j]+ " ");
                total_ele++;
            } tr++;
            // rc=tr to br
            for(int i=tr;i<=br && total_ele<r*c;i++){
                System.out.println(matrix[i][rc]);
                total_ele++;
            } rc--;
            // br=rc to lc
            for(int j=rc;j>=lc && total_ele<r*c;j--){
                System.out.println(matrix[br][j] + " ");
                total_ele++;
            } br--;
            //lc=br to tr
            for(int i=br;i>=tr && total_ele<r*c;i++){
                System.out.println(matrix[i][lc] + " ");
                total_ele++;
            } lc++;
            
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

        System.out.println("Spiral Order of matrix: ");
        spiralOrder(matrix,r,c);
    }
}
