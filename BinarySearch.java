import java.util.Arrays;
import java.util.Scanner;


public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		int N= s.nextInt();
		
		long[] arr = new long[N+1];
		
		boolean flag = false;
		
		for(int i=1;i<=N;i++){
			
			arr[i] = s.nextLong();
		}
		System.out.println(Arrays.toString(arr));
		double ans1 = Arrays.binarySearch(arr, 2);
		System.out.println(ans1);
		Arrays.sort(arr);
		int M = s.nextInt();
		
		for(int i=1;i<=M;i++){
			
			int n = s.nextInt();
			
			int ans = Arrays.binarySearch(arr, n);
			System.out.println(ans);
			
		}

	}

}
