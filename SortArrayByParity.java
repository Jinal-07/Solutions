class Solution {
    public int[] sortArrayByParity(int[] A) {
        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();
        int a = A.length;
        for(int i=0; i<a; i++){
            if(A[i]%2 == 0){
                even.add(A[i]);
            }else{
                odd.add(A[i]);
            }
        }
        even.addAll(odd);
        int[] ans = new int[a];
        int j=0;
        for(int x: even){
            ans[j] = x;
            j++;
        }
        return ans;
    }
}
