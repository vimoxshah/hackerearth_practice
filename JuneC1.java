import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class JuneC1 {

	 
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
	private static long modExp(long n, long p) {
		// TODO Auto-generated method stub
			if(p==0)
				return 1;
			
			if(p%2==0)
				return modExp((n*n)%1000000009, p/2);
			
			if(p%2==1)
				return (n*modExp((n*n)%1000000009, (p-1)/2))%1000000009;
			
			return 1;
			
	}
	    public static void main(String[] args)
	    {
	        FastReader s=new FastReader();
	        
	        int tc = s.nextInt();
	        
	        for(int i=0;i<tc;i++) {
	        	long ans=0;
	        	long num = s.nextLong();
	        	
	        	if(num%2==1) {
	        		ans=(4*num*num*num+3*num*num+8*num)/6;
	        		ans =ans%1000000009-1;
	        	}
	        	else {
	        		
	        		
	        		ans=(4*num*num*num+3*num*num+8*num)/6;
	        		ans =ans%1000000009;
	        	}
	        	//long fans=(ans)%1000000009;
	        	System.out.println(ans);
	        }

	}

}
