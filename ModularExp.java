import java.util.Scanner;


public class ModularExp {
	static long mod = 1000000007;
	
	
	public static void main(String args[]){
		
		Scanner s = new Scanner(System.in);
		int tc = s.nextInt();
		
		for(int i=0;i<tc;i++){
			
			long n= s.nextInt();
			long p=s.nextInt();
			
			System.out.println(modExp(n,p));
		}
		
	}

	private static long modExp(long n, long p) {
		// TODO Auto-generated method stub
			if(p==0)
				return 1;
			
			if(p%2==0)
				return modExp((n*n)%mod, p/2);
			
			if(p%2==1)
				return (n*modExp((n*n)%mod, (p-1)/2))%mod;
			
			return 1;
			
	}

	
}
