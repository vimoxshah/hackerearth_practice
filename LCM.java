import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LCM {
	static long lcm, x, max, min, ans = 1;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		long n = s.nextLong();
		
		long ans1=n;
	
		for(long i=n;i>=1;i--) {
			
			//long hcf =ans1.gcd(long.valueOf(i-1));
			ans1 = lcm(ans1,i-1);
			ans=	lcm(ans1,i-2);
			List<Long> pm1 = primeFactors(i);
			List<Long> pm2 = primeFactors(i-1);
			
		
		//	System.out.println(ans1);
			
			if(ans1 == ans) {
				System.out.println(i-1);
				break;
			}
			ans1=ans;
			
		}
		//System.out.println(ans);
		//System.out.println(ans1);
		
	}

	public static List<Long> primeFactors(long numbers) {
		long n = numbers;
		List<Long> factors = new ArrayList<Long>();
		for (int i = 2; i <= n / i; i++) {
			while (n % i == 0) {
				factors.add((long) i);
				n /= i;
			}
		}
		if (n > 1) {
			factors.add(n);
		}
		return factors;
	}

	public static long lcm(long a, long l) {

		if (a > l) {
			max = a;
			min = l;
		} else {
			max = l;
			min = a;
		}

		for (int i = 1; i <= min; i++) {
			x = max * i; 
			if (x % min == 0) 
								
			{
				lcm = x; 
				break; 
			}
		}
		return lcm;
	}
}
