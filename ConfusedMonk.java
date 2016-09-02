import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ConfusedMonk {
	
	static long mod=1000000007;

	public static long bigMod(long a, long b){

			if(a==0)
				return 1;
			
			if(b==0)
				return 1;
			
			if(b%2==0)
				return bigMod((a*a)%mod, b/2);
			
			if(b%2==1)
				return (a*bigMod((a*a)%mod, (b-1)/2))%mod;	
		
			return 1;
		
	}
	
	static int gcd(int a, int b) {

		if (b == 0) {
			return a;
		}
		else {
			return gcd(b, a % b);
		}
	}
	
	public static void main(String[] args) {
		

		BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
		
		try {
			
			
			int N=Integer.parseInt(bufferedReader.readLine());
			
			int[] num=new int[N];
			String[] input=bufferedReader.readLine().split(" ");
			
			long a=1;
			
			for(int i=0;i<N;i++){
				
				num[i]=Integer.parseInt(input[i]);
			}
			
			int gcd=1;
                 gcd=num[0];
				
				for(int i=0;i<N;i++){
					gcd=gcd(gcd, num[i]);
					a*=num[i];
					a=a%mod;
				}
			
			
			//System.out.println("a:"+a+" gcd:"+gcd);
			System.out.println(bigMod(a, gcd));	
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
