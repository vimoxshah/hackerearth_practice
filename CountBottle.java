/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;


class CountBottle {
    public static void main(String args[] ) throws Exception {
        /*
         * Read input from stdin and provide input before running*/
    	Scanner s = new Scanner(System.in);
      
        int N = s.nextInt();
        for (int i = 0; i < N; i++) {
            
            int n=s.nextInt();
            int n1= s.nextInt();
            Long[] arr= new Long[n];
            int ans =0;
            int c=0;
            
            for(int j=0;j<n;j++){
            	arr[j]=s.nextLong();
            }
            Arrays.sort(arr);
            
            for(int k=0;k<arr.length;k++){
            	if(n1>=arr[k]){
            		n1=(int) (n1-arr[k]);
            		c++;
            	}
            }
            System.out.println(c);
            
            
        }
        

       // System.out.println("Hello World!");
    }
}
