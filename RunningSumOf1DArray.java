class Solution {
    public int[] runningSum(int[] nums) {
        int a = nums.length;
        int[] jinal = new int[a];
        for(int i=0; i<a; i++){
            for(int j=0; j<=i; j++){
                jinal[i] += nums[j];
            }
        }
        return jinal;
    }
}
