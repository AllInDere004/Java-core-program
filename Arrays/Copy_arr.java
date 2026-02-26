// Copy one array list to another array list 

import java.util.Scanner;

public class Copy_arr {
    public static void main(String[] args) {
        int a[]=new int[3];
        int b[]=new int[5];
        int i;
        Scanner r=new Scanner(System.in);
        System.out.println("Enter the values in 1st Array: ");
        for(i=0;i<3;i++){
            a[i]=r.nextInt();
        }
        System.out.println("First array elements: ");
        for(i=0;i<3;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        System.out.println("2ns array elements: ");
        for(i=0;i<3;i++){
            b[i]=a[i];
            System.out.println(b[i]+" ");
        }
    }    
}
