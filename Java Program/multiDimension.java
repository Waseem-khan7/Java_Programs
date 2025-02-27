import java.util.Scanner;
// import java.util.Arrays;
public class multiDimension {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[3][3];
        //input
        for (int rows = 0; rows < arr.length; rows++) {
            for (int col = 0; col <arr[rows].length; col++) {
                arr[rows][col]= in.nextInt();
            }
        }
        in.close();
        //output
        for (int rows = 0; rows <arr.length; rows++) {


 // System.out.println(Arrays.toString(arr[rows]));

            for (int col = 0; col < arr[rows].length; col++) {
                System.out.print(arr[rows][col]+" ");
            }
            System.out.println();
       }
        // for (int[] value: arr ) {
        //         System.out.println(Arrays.toString(value));
        // }
    }
}
