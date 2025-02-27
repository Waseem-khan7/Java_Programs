public class BS {
    public static void main(String[] args) {
        int[] nums = {3,4,5,6,1,2};
        System.out.println(findMin(nums));
    }
    static int findMin(int[] nums) {
        int s=0;
        int e=nums.length-1;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(mid<e && nums[mid]>nums[mid+1]){
                return nums[mid+1];
            }
            if(mid>s && nums[mid] <nums[mid-1]){
                return nums[mid];
            }
            if(nums[mid]>nums[s]){
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        }
        return nums[0];
    }
}
