import java.util.Scanner;


public class LastElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		int N= s.nextInt();
		int M = s.nextInt();
		long[] arr = new long[N+1];
		int ans=0;
		boolean flag = false;
		
		for(int i=1;i<=N;i++){
			
			arr[i] = s.nextLong();
		}
		
		for(int i=N;i>=1;i--){
			
			if(arr[i] == M){
				flag= true;
				ans = i;
				break;
			}
			
			
		}
		if(flag){
			System.out.println(ans);
		}
			
			else{
				System.out.println(-1);
			}
		

	}

}
