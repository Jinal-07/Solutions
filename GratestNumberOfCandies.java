class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        int a = candies.length;
        for(int i=0; i<a; i++){
            if(candies[i] > max){
                max = candies[i];
            }
        }
        boolean[] ans = new boolean[a];
        for(int i=0; i<a; i++){
            int b = candies[i]+extraCandies;
            if(b>=max){
                ans[i]=true;
            }else{
                ans[i]=false;
            }
        }
        List<Boolean> list = new ArrayList<>();
        for(int i=0;i<a;i++)
        {
            list.add(ans[i]);
        }
        return list;
    }
}
