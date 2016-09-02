import java.math.BigInteger;
import java.util.Scanner;
 
public class PrimeNumCheck {
  public static void main(String[] args) {
	  
	 Scanner s = new Scanner(System.in);
	 int tc = s.nextInt();
	 long n;
	for(int i=0;i<tc;i++){
		
		n = s.nextLong();
		boolean ans =BigInteger.valueOf(n).isProbablePrime(9);
		
		if(ans){
			System.out.println("prime");
		}
		else{
			System.out.println("composite");
		}
			 
		 
	}
			    
	}
  
  }
