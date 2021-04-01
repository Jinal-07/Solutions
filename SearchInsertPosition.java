class Solution {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int start = 0;
        int end = n-1;
        int result = -1;
        int mid = 0;
        while(start<=end){
            mid = start+(end-start)/2;
            if(nums[mid]==target){
                return mid;
            }else if(nums[mid]<target){
                start = mid+1;
            }else if(nums[mid]>target){
                result = mid;
                end = mid-1;
            }
        }
        if(result==-1 && mid==n-1){
            result = n;
        }
        return result;
    }
}
