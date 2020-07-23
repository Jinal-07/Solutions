import java.util.*;
import java.lang.*;
import java.io.*;

//https://practice.geeksforgeeks.org/problems/reverse-an-array/0/

class GFG {
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
	PrintWriter out = new PrintWriter(System.out);
	int T = sc.nextInt();
	for(int x=0; x<T; x++){
	    
	    int N = sc.nextInt();
	    int[] A = new int[N];
	    for(int i=0; i<N; i++){
	        A[i] = sc.nextInt();
	    }
	    for(int i=N-1; i>=0; i--){
	        out.print(A[i]+" ");
	    }
	    
	    out.println();
	    out.flush();
	    
	}
	}
}
