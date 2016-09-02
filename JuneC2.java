import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;


public class JuneC2 {
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
	public static void main(String[] args) {
		
		FastReader fr = new FastReader();
		
		int num = fr.nextInt();
		List<Integer> l = new ArrayList<Integer>();
		List<Integer> l1 = new ArrayList<Integer>();
		List<Integer> l2 = new ArrayList<Integer>();
		for(int i=0;i<2*num;i++) {
			
			l.add(fr.nextInt());
		}
		
		for(int i=0;i<2*num;i++) {
			
			l1.add(fr.nextInt());
		}
		int ans=0;
		int x3 =0;
		int y3 =0;
		int x2=0,y2=0;
		int dist=0;
		for(int i=0;i<l1.size();i+=2) {
			int min=Integer.MAX_VALUE;
			
			
			int x1=l1.get(i);
			int y1=l1.get(i+1);
			
			for(int j=0;j<l.size();j+=2) {
			
				
				 x2=l.get(j);
				 y2=l.get(j+1);
				
				if(!(l2.contains(x2)&&l2.contains(y2))) { 
					
					dist = Math.abs(x1-x2)+Math.abs(y1-y2);
				}
				
				
				min = Math.min(min, dist);
				if(min==dist) {
					 x3=l.indexOf(x2);
					 y3=l.indexOf(y2);
					 l2.add(x2);
					 l2.add(y2);
				}
				
				
			}
			
		/*
			System.out.println(x3+"\t"+y3);
			System.out.println(l.get(x3)+"\t"+l.get(y3));
			if(l.size()>2) {
				l.remove(x2);
			
				l.remove(y2);
			}*/
		//	System.out.println(x+"\t"+y);
			ans+=min;
		
		}
		System.out.println(ans);
	}

}
