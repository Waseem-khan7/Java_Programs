import java.util.*;
import java.util.Arrays;
public class numberWithEvenDigit {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        findNumbers(nums);
        
    }
        public static int findNumbers(int[] nums) {
            int counter = 0;
            for(int i=0; i<nums.length; i++){
                int count=0;
                while(i!=0){
                    i=i/10;
                    count++;
                }
                if(count%2 == 0)
                counter++;
            }
            return counter;
        }
    }

// public static void main(String[] args) {
//     int[] nums = {1,2,3,4};
// }
//     public int[] runningSum(int[] nums) {
//         for(int i=0; i<nums.length; i++){
//             nums[i] = nums[i]+ nums[i-1];
//         }
//         return nums;
//     }
//     }


// List<Integer> arr = new ArrayList<>();
// Collections.sort(matrix[][]);
// for(int i=0; i<matrix.length; i++){
//    int minIndex = 0; 
//    int min = 99999999;
//    for(int j=0; j<matrix[i].length; j++){
//        if(matrix[i][j] < min)
//            min = matrix[i][j];
//            minIndex = j;
//    }
//    boolean isTrue = true;
//    for(int j=0; j<matrix.length; j++){
//        if(matrix[i][minIndex] < matrix[j][minIndex])
//            isTrue = false;
//            break;
//    }
//    if(isTrue)
//        arr.add(matrix[i][minIndex]);
// }
// return arr;
// }
// }