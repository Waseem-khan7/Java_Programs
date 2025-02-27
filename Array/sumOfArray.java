
import java.util.Scanner;

import java.util.Arrays;
    public class sumOfArray {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println("enter the length (row) of the array:");
            int row = in.nextInt();
            int [] arr = new int [row];
            for (int i = 0; i < row; i++) {
                arr[i] = in.nextInt();
            }
            System.out.println("enter the length (cols) of the array:");
            int cols = in.nextInt();
            int [] arr1 = new int [cols];
            for (int i = 0; i < cols; i++) {
                arr1[i] = in.nextInt();
            }
            int [] resultantArray = new int [row];
            for (int i = 0; i < resultantArray.length; i++) {
                resultantArray[i] = (arr[i] + arr1[i]);
                
            }
            // for (int i = 0; i < resultantArray.length; i++) {
            //     System.out.print(resultantArray[i]);
            //     System.out.println();
            // }
            System.out.println("ResultantArray is:" + Arrays.toString(resultantArray));
        }

    }