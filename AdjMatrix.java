import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class AdjMatrix {

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
		// TODO Auto-generated method stub
		
		FastReader fs = new FastReader();
		int N = fs.nextInt();
		int M = fs.nextInt();
		
		makeGraph(N);
		
		for(int i=0;i<M;i++) {
			int A = fs.nextInt();
			int B = fs.nextInt();
			
			makeEdge(A,B,1);
		}
		int Q = fs.nextInt();
		
		for(int i=0;i<Q;i++) {
			int A = fs.nextInt();
			int B = fs.nextInt();
			
			int ans = getEdge(A, B);			
			
		
			if(ans==1) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
		}

	}
private static int getEdge(int a, int b) {
		// TODO Auto-generated method stub
		try {
		int ans=matrix[a][b];
		return ans;
		}
		catch(ArrayIndexOutOfBoundsException e) {
			
		}
		return -1;
		
	}
static int[][] matrix;
private static void makeGraph(int m) {
		// TODO Auto-generated method stub
	
	 matrix = new int[m+1][m+1];
		
	}


private static void makeEdge(int a, int b,int edge) {
		try {
		matrix[a][b]=edge;
		}
		catch(Exception e) {
			
		}
}

}