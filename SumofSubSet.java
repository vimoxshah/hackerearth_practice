import java.util.Scanner;


public class SumofSubSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		int tc = s.nextInt();
		
		for(int i=0;i<tc;i++) {
			long n= s.nextLong();
			long sum= (long) (((n*(n+1))/2)*(Math.pow(2, n-1)));
			System.out.println(sum);
			
		}
	}

}
