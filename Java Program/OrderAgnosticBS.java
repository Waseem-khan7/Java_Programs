import java.util.*;

public class OrderAgnosticBS {

    static int OrderAgnostic(int[] arr, int s, int e, int target){
        
        // check the sorted order of the given array
        boolean isAsc = arr[s] < arr[e];
        while(s<=e){
            int mid = s+(e-s)/2;

            if(arr[mid]==target){
                return mid;
            }
            // if array in ascending order
            if(isAsc){
                if(arr[mid]<target){
                    s=mid+1;
                }
                else{
                    e=mid-1;
                }
            }

            // if array in ascending order
            else{
                if(arr[mid]>target){
                    s=mid+1;
                }
                else{
                    e=mid-1;
                }
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        int arr[] = {43, 37, 29,18,9,7,6};
        int n= arr.length;
        int target =6;
        System.out.println(OrderAgnostic(arr, 0, n-1, target));
    }
}
