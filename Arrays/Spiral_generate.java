import java.util.Scanner;

public class Spiral_generate {
    
    static void printMatrix(int[][] matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[][] generateSpiralOrder(int n){
        int tr=0,br=n-1,lc=0,rc=n-1;
        int[][] matrix= new int[n][n];
        int curr=1;
        while (curr <= n*n) {
            // tr=lc to rc
            for(int j=lc;j<=rc && curr<=n*n;j++){
                matrix[tr][j]=curr++;
                
            } tr++;
            // rc=tr to br
            for(int i=tr;i<=br && curr<=n*n;i++){
                matrix[i][rc]=curr++;
                
            } rc--;
            // br=rc to lc
            for(int j=rc;j>=lc && curr<=n*n;j--){
                matrix[br][j]=curr++;
                
            } br--;
            //lc=br to tr
            for(int i=br;i>=tr && curr<=n*n;i++){
                matrix[i][lc]=curr++;
                
            } lc++;
            
        }
        return matrix;

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n: ");
        int n=sc.nextInt();

        int[][] matrix=generateSpiralOrder(n);
        printMatrix(matrix);
    }

}
