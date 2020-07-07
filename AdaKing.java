import java.util.*;
import java.lang.*;
import java.io.*;

//https://www.codechef.com/JULY20B/problems/ADAKING
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
		    int k = sc.nextInt();
		    int dot = 1;
		    
		    for(int i=1; i<9; i++){
		        for(int j=1; j<9; j++){
		            if(i==1 && j==1){
		                out.print("O");
		            }else if(dot < k){
		                out.print(".");
		                dot++;
		            }
		            else{
		                out.print("X");
		            }
		        }
		        out.println();
		    }
		    out.flush();
		    out.println();
		}
		
	}
}
