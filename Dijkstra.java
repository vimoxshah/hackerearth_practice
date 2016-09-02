import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Dijkstra {

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
	 
static long[][] matrix;
private static void makeGraph(long m) {
	// TODO Auto-generated method stub

 matrix = new long[(int)m+1][(int)m+1];
 for(int i=1;i<=m;i++) {
	 for(int j=1;j<=m;j++) {
		 matrix[i][j]=Integer.MAX_VALUE;
	 }
 }
	
}

private static void makeEdge(long a, long b,long d) {
		try {
		matrix[(int)a][(int)b]=d;
		matrix[(int)b][(int)a]=d;
		}
		catch(Exception e) {
			
		}
}
static void floydWarshall(long graph[][],long V)
{
    long dist[][] = new long[(int)V+1][(int)V+1];
    int i, j, k;

    /* Initialize the solution matrix same as input graph matrix.
       Or we can say the initial values of shortest distances
       are based on shortest paths considering no intermediate
       vertex. */
    for (i = 1; i <= V; i++)
        for (j = 1; j <= V; j++)
            dist[i][j] = graph[i][j];

    /* Add all vertices one by one to the set of intermediate
       vertices.
      ---> Before start of a iteration, we have shortest
           distances between all pairs of vertices such that
           the shortest distances consider only the vertices in
           set {0, 1, 2, .. k-1} as intermediate vertices.
      ----> After the end of a iteration, vertex no. k is added
            to the set of intermediate vertices and the set
            becomes {0, 1, 2, .. k} */
    for (k = 1; k < V; k++)
    {
        // Pick all vertices as source one by one
        for (i = 1; i < V; i++)
        {
            // Pick all vertices as destination for the
            // above picked source
            for (j = 1; j <= V; j++)
            {
                // If vertex k is on the shortest path from
                // i to j, then update the value of dist[i][j]
                if (dist[i][k] != Integer.MAX_VALUE && dist[k][j] != Integer.MAX_VALUE && dist[i][k] + dist[k][j] < dist[i][j])
                    dist[i][j] = dist[i][k] + dist[k][j];
            }
        }
    }
  /*  for(int l=1;l<=V;l++) {
		for(int m=1;m<=V;m++) {
			System.out.print(dist[l][m]+" ");
		}
		System.out.println();
	}*/

    // Print the shortest distance matrix
    printSolution(dist,V);
}

static void printSolution(long dist[][],long V)
{
   int sum=0;
    for (int i=1; i<V; i++)
    {
        for (int j=i+1; j<=V; j++)
        {
            	sum+=dist[i][j];
            
            
        }
       
    }
    String s = Integer.toBinaryString(sum);
    System.out.println(sum);
}
private static long modExp(long n, long p) {
	// TODO Auto-generated method stub
		if(p==0)
			return 1;
		
		if(p%2==0)
			return modExp((n*n), p/2);
		
		if(p%2==1)
			return (n*modExp((n*n), (p-1)/2));
		
		return 1;
		
}
	public static void main(String[] args) {
		
		FastReader s = new FastReader();
		long N = s.nextLong();
		long M = s.nextLong();
		makeGraph(N);
		
		for(int i=0;i<M;i++) {
			long A =s.nextLong();
			long B =s.nextLong();
			long C = s.nextLong();
			long D=modExp(2,C);
			//System.out.println(D);
			makeEdge(A,B,D);
			
		}
		
		
		floydWarshall(matrix, N);
		
	

	}

}
