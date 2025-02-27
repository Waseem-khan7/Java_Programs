import java.util.*;
public class rotatedSArray {
    public static void main(String[] args) {
        
    }
    static int search(int[] nums, int target) {
        int pivot = findPivot(nums);
        if(pivot==-1){
            return binarySearch(nums, 0, nums.length-1, target);
        }
        if(nums[pivot] == target){
            return pivot;
        }
        if(target >= nums[0]){
            return binarySearch(nums, 0, pivot-1, target);
        }
        return binarySearch(nums, pivot+1, nums.length-1, target);
        
            
    }
        static int binarySearch(int[] nums, int s, int e, int target){
            while(s<=e){
                int mid=s+(e-s)/2;
                if(nums[mid]==target){
                    return mid;
                }
                if(nums[mid]<target){
                    s=mid+1;
                }
                else{
                    e=mid-1;
                }
            }
            return -1;
        }
        
        static int findPivot(int[] nums){
            int s=0;
            int e=nums.length-1;
            while(s<=e){
                int mid=s+(e-s)/2;
                if(mid<e && nums[mid]>nums[mid+1]){
                    return mid;
                }
                if(mid>s && nums[mid]<nums[mid-1]){
                    return mid-1;
                }
                if(nums[mid]<=nums[s]){
                    e=mid-1;
                }
                else{
                    s=mid+1;
                }
            }
            return -1;
        }
}



// static int search(int[] nums, int target) {
//     int s=0;
//     int e=nums.length-1;
//     while(s<=e){
//         int mid = s+(e-s)/2;
//         if(nums[mid]==target){
//             return mid;
//         }
//         if(nums[mid]>=nums[s]){
//             if(target>=nums[s] && target<=nums[mid])
//                 e=mid-1;
//             else
//                 s=mid+1;
//         }
//         else{
//             if(target>=nums[mid] && target<=nums[e])
//                 s=mid+1;
//             else
//                 e=mid-1;

//         }
//     }
//     return -1;
// }