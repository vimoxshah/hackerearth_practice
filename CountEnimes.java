import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
 
class CountEnimes {
     
    public static void main(String args[] ) throws Exception {
    	
    	Scanner s = new Scanner(System.in);
    	int tc = s.nextInt();
       
        for(int i=0;i<tc;i++){
        	
        String input  = s.next();
       
        	String[] tokens = input.split("\\*");
        	//System.out.println(Arrays.toString(tokens));
        	int count = 0;
        	for(String token : tokens){
        		if(!token.contains("X"))
        		  count+=token.length();
        	}
           System.out.println(count);
         }
       }
     }