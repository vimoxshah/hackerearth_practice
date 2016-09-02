import java.util.Arrays;
import java.util.Scanner;


public class DiscoverEle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		int N= s.nextInt();
		int Q = s.nextInt();
		
		Long[] arr = new Long[N+1];
		arr[0]=(long) 0;
		for(int i=1;i<=N;i++) {
			arr[i]=s.nextLong();
			
		}
		Arrays.sort(arr);
		for(int j=1;j<=Q;j++) {
			long n = s.nextLong();
			
			int k  = Arrays.binarySearch(arr, n);
			
			
			
			if(k>0) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
		}
		
	}

}
