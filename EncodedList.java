class Solution {
    public int[] decompressRLElist(int[] nums) {
        List<Integer> decompressed = new ArrayList<>();
        int a = nums.length;
        for(int i=0; i<a; i++){
            int freq = nums[i];
            i++;
            int val = nums[i];
            for(int j=1; j<=freq; j++){
                decompressed.add(val);
            }
        }
        int[] temp = new int[decompressed.size()];
        int j = 0;
        for(int x:decompressed){
            temp[j] = x;
            j++;
        }
        return temp;
    }
}
