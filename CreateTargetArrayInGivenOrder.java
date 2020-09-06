class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
       List<Integer> target = new ArrayList<>();
       int a = nums.length;
       for(int i=0; i<a; i++){
           target.add(index[i],nums[i]);
       }
       int[] temp = new int[target.size()];
        int j=0;
       for(int x:target)
       {
           temp[j]=x;
           j++;
       }
        return temp;
    }
}
