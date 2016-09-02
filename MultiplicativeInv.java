        
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MultiplicativeInv {
	
    public static void main(String[] args) {
      
    	Scanner s = new Scanner(System.in);
    	
    	long n = s.nextLong();
    	
    	long mod1 = 1000000007;
    				 
    	//System.out.println(pow(n,mod1-2,mod1));		
    			
    	System.out.println(BigInteger.valueOf(n).modInverse(BigInteger.valueOf(mod1)));
	
    	}
}
/*
	private static int pow(long a, long b, long MOD) {
		// TODO Auto-generated method stu
		
			int x = 1, y = (int) a;
			    while(b > 0) {
			        if(b%2 == 1) {
			            x=(x*y);
			            if(x>MOD) x%=MOD;
			        }
			        y = (y*y);
			        if(y>MOD) y%=MOD;
			        b /= 2;
			    }
			    return x;
			}
	}*/

    
