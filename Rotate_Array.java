/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {

//https://practice.geeksforgeeks.org/problems/rotate-array-by-n-elements/0

	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		for(int x=0;x<t;x++)
		{
		    int N = sc.nextInt();
		    int D = sc.nextInt();
		    int arr[] = new int[N];
		    PrintWriter out=new PrintWriter(System.out); 
		    for(int i=0; i<N; i++)
		    {
		        arr[i] = sc.nextInt();
		    }
		
		    for(int i=D;i<N;i++)
		    {
		        out.print(arr[i]+" ");
		    }
		    for(int i=0;i<D;i++)
		    {
		        out.print(arr[i]+" ");
		    }
		    out.println();
		    out.flush();
		
		}
	}
}
