/* toString()
    asList()
    deepToString() */

import java.util.Arrays;

public class Special_arr {
    public static void main(String[] args) {
        String a[] = {"I","am","a","Java","Developer"};
        System.out.println("toString: "+ Arrays.toString(a));
        System.out.println("asList: "+ Arrays.asList(a));

        int arr[][]={{10,20},{30,40}};
        System.out.println("deepToString: "+ Arrays.deepToString(arr));
    }
}
