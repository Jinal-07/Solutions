class Solution {
    public int[] sortedSquares(int[] A) {
      int a = A.length;
      int[] squares = new int[a]; 
      for(int i=0; i<a; i++){
          squares[i] = A[i]*A[i];
      }
      for(int i=0; i<a-1; i++) {
			boolean sorted = true;
			for(int j=0; j<a-1-i; j++) {
				    if(squares[j+1] < squares[j]) {
					int temp = squares[j+1];
					squares[j+1] = squares[j];
					squares[j] = temp;
					
					sorted = false;
				}	
			}
			    if(sorted)
				break;
		}
        return squares;
    }
}
