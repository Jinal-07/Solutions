class Solution {
    public int findDuplicate(int[] nums) {
      int n = nums.length - 1;
        int duplicate = -1;
      for(int i=1; i<n+1; i++){
          for(int j=0; j<i; j++){
              if(nums[i] == nums[j]){
                  duplicate = nums[i];
                  break;
              }
          }
      }
       return duplicate; 
    }
}
