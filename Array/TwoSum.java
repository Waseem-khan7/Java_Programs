import java.util.Scanner;
public class TwoSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr [] = { 2, 7, 5, 13, 6};
        int target = 9;
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] + arr[j]  == target){
                    break;                
            }
            }
        }
        System.out.println(index);

    }
}
