import java.util.Scanner;

public class SortedArray {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array:");
        int size= sc.nextInt();
        int[] numbers = new int [size];
        for (int i=0; i<size; i++){
            numbers[i] = sc.nextInt();
        }
        sc.close();
        // boolean isAscending = true;
        // for (int i =0; i<numbers.length-1; i++){
        //     if(numbers[i]>numbers[i+1]){
        //         isAscending = false;
        //     }
        // }
        // if(isAscending){
        //     System.out.println("the array is sorted in ascending order");
        // }
        // else{
        //     System.out.println("the array is not sorted in ascending order");
        // }

            
        int temp =0;
       for (int i = 0; i<numbers.length; i++){
        for (int j = i+1; j<numbers.length; j++){
            if(numbers[i] > numbers[j]){
            temp = numbers[i];
            numbers[i] = numbers[j];
            numbers[j] = temp;
            }
        }
        
       }
       System.out.println("elemets of array sorted in ascending order:");
       for (int i =0; i<numbers.length; i++){
        System.out.println(numbers[i]);
       }
    }
}
