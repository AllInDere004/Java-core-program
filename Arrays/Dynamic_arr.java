
import java.util.Scanner;

public class Dynamic_arr {
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

        System.out.println("Printed array elements: ");
        for(i=0;i<size;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        System.out.println(a.length);
    }
    
}
