class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        for(int i=0; i<n; i++) {
			boolean sorted = true;
			for(int j=0; j<n-1-i; j++) {
				    if(nums[j+1] < nums[j]) {
					int temp = nums[j+1];
					nums[j+1] = nums[j];
					nums[j] = temp;

					sorted = false;
				}	
			}
			    if(sorted)
				break;
		}
    }
}
