import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Multipleof3 {

	public static void main(String args[]) {
		
		Scanner s = new Scanner(System.in);
		int tc = s.nextInt();
		
		for(int i=0;i<tc;i++) {
			BigInteger b1 = s.nextBigInteger();
			BigInteger b2 = s.nextBigInteger();
			
			BigInteger gcd = b1.gcd(b2);
			
			if(gcd.equals(BigInteger.valueOf(1))) {
				System.out.println("Is a Co-Prime");
			}
			else {
				System.out.println("Not a Co-Prime");
			}
			
		}
	}
}
