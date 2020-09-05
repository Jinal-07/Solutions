class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int a = nums.length;
        int[] ans = new int[a];
        for(int j=0; j<a; j++){
          for(int i=0; i<a; i++){
              if(i != j){
                  if(nums[j] < nums[i]){
                     ans[i]++;
                  }
              }
          }
        }
        return ans;
    }
}
