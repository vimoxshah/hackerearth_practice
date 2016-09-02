
import java.util.Arrays;
import java.util.Scanner;


class Tour {
    public static void main(String args[] ) throws Exception {
        /*
         * Read input from stdin and provide input before running
*/
    	Scanner s = new Scanner(System.in);
       
       
        int N = s.nextInt();
        
        long[][] arr = new long[N][N];
        String[] city = new String[N];
        
        for(int i=0;i<N;i++){
        	city[i] = s.next();
        	}
       
        for (int i = 0; i < N; i++) {
        	for(int j=0;j<N;j++){
        		long n = s.nextInt();
        		arr[i][j] = n;
        	}
        }
    
    	int visit = s.nextInt();
    	String[] visit_city = new String[visit];
    	 
    	 for(int i=0;i<visit;i++){
         visit_city[i] = s.next();
        
         
    	 }
    	 long ans =0;
    	 
    	 int v1 = Arrays.asList(city).indexOf(visit_city[0]);
    	 long ans1 = arr[0][v1];
    	 
    	for (int i = 0; i <visit-1; i++) {
        	 
    		String t1 = visit_city[i];
    		String t2 = visit_city[i+1];
        		
    		
    		int i1= Arrays.asList(city).indexOf(t1);
    		int i2= Arrays.asList(city).indexOf(t2);
    		
    		ans+= arr[i1][i2];
    		
        	}
    			System.out.println(ans+ans1);
          }
}
