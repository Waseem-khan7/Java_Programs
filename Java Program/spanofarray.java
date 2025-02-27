import java.util.*;
public class spanofarray {

          //    Print  SPAN (diffrence between maximum and minimum element) of an array

//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the Size of an array: ");
//         int n = sc.nextInt();
//         int arr []= new int[n];
//         for (int i =0 ; i<arr.length; i++){
//             arr[i]= sc.nextInt();
//         }
//         int max = arr[0];
//         int min = arr[0];
//         for (int i=0; i<arr.length; i++){
//             if(arr[i]>max){
//                 max = arr[i];
//             }
//             if (arr[i]<min){
//                 min= arr[i];
//             }
//         }
//         int span = max-min;
//     System.out.println("the span of the array is :" + span);

//     }
// }



        //    find the element in an array (print the index of that array)


public static void main(String args[]){
    Scanner ab = new Scanner(System.in);
    System.out.println("enter the length of an array:");
    int n = ab.nextInt();
    int arr[]= new int[n];
    System.out.println("enter the elements of array");
    for(int i =0; i<n; i++){
        arr[i]= ab.nextInt();
    }
    int index = -1;
    System.out.println("enter the element data which index you want to know");
    int data = ab.nextInt();
    ab.close();
    for (int i=0; i<n; i++){
        if(arr[i]== data){
            index = i;
        break;
    }
    }
    System.out.println("Index of the data element is :" + index);
    }
}

