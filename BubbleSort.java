import java.util.Arrays;
import java.util.Scanner;


public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		int tc= s.nextInt();
		
	
		for(int k=0;k<tc;k++) {
			long c=0;
			long N = s.nextLong();
			long[] arr = new long[(int) N];
			
			for(int i=0;i<N;i++){
			
				arr[i] = s.nextLong();
			
			}
		
			for(int i=0;i<arr.length-1;i++){
			
				for(int j=0;j<arr.length-i-1;j++){
				
					if(arr[j]>arr[j+1]){
					
						long temp=arr[j];
						arr[j]=arr[j+1];
						arr[j+1]=temp;
					
						c+=1;
				}
			}
		}
		System.out.println(c);
		}
	}

}
