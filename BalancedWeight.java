import java.math.BigInteger;
import java.util.Scanner;


public class BalancedWeight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s =new Scanner(System.in);
		int tc =s.nextInt();
		
		for(int i=0;i<tc;i++) {
			
			int n=s.nextInt();
			BigInteger[] arr = new BigInteger[n];
			BigInteger gcd = null;
			for(int j=0;j<n;j++) {
				gcd = s.nextBigInteger();
				gcd= gcd.gcd(s.nextBigInteger());
				
			}
			
			
			System.out.println(gcd.multiply(BigInteger.valueOf(n)));
			
		}
	}

}
