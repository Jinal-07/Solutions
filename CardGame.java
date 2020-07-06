import java.util.*;
import java.lang.*;
import java.io.*;
//https://www.codechef.com/JULY20B/problems/CRDGAME
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
		    int n = sc.nextInt();
		    
		    int[] a = new int[n];
		    int[] b = new int[n];
		    for(int i=0; i<n; i++){
		        a[i] = sc.nextInt();
		        b[i] = sc.nextInt();
		    }
		    
		   int totalA=0;
		   int totalB=0;
		   for(int i=0;i<n;i++)
		   {
		        int sumA = 0;
		        while(a[i]>0){
		            int lastDigit = a[i]%10;
		            a[i] /= 10;
		            sumA += lastDigit;
		        }
		        int sumB = 0;
		        while(b[i]>0){
		            int lastDigit = b[i]%10;
		            b[i] /= 10;
		            sumB += lastDigit;
		        }
		    
		        if(sumA>sumB){
		            totalA=totalA+1;
		        }
		        else if(sumB>sumA){
		            totalB+=1;
		        }
		        else if(sumA==sumB){
		            totalA+=1;
		            totalB+=1;
		        }
		   }
		   
		   if(totalA>totalB){
		       out.println("0 "+totalA);
		   }else if(totalB>totalA){
		       out.println("1 "+totalB);
		   }else {
		       out.println("2 "+totalA);
		   }
		   
		   out.flush(); 
		    
		    
		}
	}
}
