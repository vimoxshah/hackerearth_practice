import java.util.Scanner;


public class TerribleChandu {
	 public static void main(String args[] ) throws Exception {
	        /*
	         * Read input from stdin and provide input before running*/
	    	Scanner s = new Scanner(System.in);
	    	
	        int N = s.nextInt();
	        for (int i = 0; i < N; i++) {
	        	StringBuilder sb =new StringBuilder();
	        	String st= s.next();
	        	sb.append(st);
	        	sb.reverse();
	        	 System.out.println(sb.toString());
	        }
	       
	 }
	 

}
