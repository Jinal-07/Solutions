class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int i1 = -1;
        int i2 = -1;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                   if(nums[j]+nums[i] == target){
                    i1 = i;
                    i2 = j;
                    break;
                }
            }
        }
        int[] indices = new int[2];
        indices[0] = i1;
        indices[1] = i2;
        return indices;
    }
}
