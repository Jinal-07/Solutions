import java.util.*;
import java.lang.*;
import java.io.*;
//https://www.codechef.com/JULY20B/problems/CHEFSTR1
class Codechef
{
    
    static class FastReader 
    { 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastReader() 
        { 
            br = new BufferedReader(new
                     InputStreamReader(System.in)); 
        } 
  
        String next() 
        { 
            while (st == null || !st.hasMoreElements()) 
            { 
                try
                { 
                    st = new StringTokenizer(br.readLine()); 
                } 
                catch (IOException  e) 
                { 
                    e.printStackTrace(); 
                } 
            } 
            return st.nextToken(); 
        } 
  
        int nextInt() 
        { 
            return Integer.parseInt(next()); 
        } 
  
        long nextLong() 
        { 
            return Long.parseLong(next()); 
        } 
  
        double nextDouble() 
        { 
            return Double.parseDouble(next()); 
        } 
  
        String nextLine() 
        { 
            String str = ""; 
            try
            { 
                str = br.readLine(); 
            } 
            catch (IOException e) 
            { 
                e.printStackTrace(); 
            } 
            return str; 
        } 
    } 
    
	public static void main (String[] args) throws java.lang.Exception
	{
		FastReader sc=new FastReader();
		PrintWriter out=new PrintWriter(System.out);
		int test=sc.nextInt();
		while(test-- > 0)
		{
		    long sum=0;
		    int n = sc.nextInt();
		    int[] arr = new int[n];
		    for(int i=0; i<n; i++)
		    {
		        arr[i]=sc.nextInt();
		    }
		    for(int i=0; i<n-1; i++){
		        int diff=Math.abs(arr[i]-arr[i+1]);
		        //if(diff!=0)
		            diff=diff-1;
		        sum += diff;
		    }
		 
		    out.println(sum);
		    out.flush();
		    
		}
	}
}
