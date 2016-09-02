/* IMPORTANT: Multiple classes and nested static classes are supported */


 // uncomment this if you want to read input.
import java.io.BufferedReader;
import java.io.InputStreamReader;


class BitMan {
    public static void main(String args[] ) throws Exception {
        
        //  Read input from stdin and provide input before running

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
        for (int i = 0; i < N; i++) {
           int n = Integer.parseInt(br.readLine());
           
           	int c=0;
           	while(n>0){
           
           		n = n&(n-1);
           		c= c+1;
           		
        }
           	System.out.println(c);
              
           
        }
        

      
    }
}
