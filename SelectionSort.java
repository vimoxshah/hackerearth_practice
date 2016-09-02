import java.util.Arrays;
import java.util.Scanner;


public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Scanner s = new Scanner(System.in);
		int N= s.nextInt();
		int M =s.nextInt();
		int c=0;
		long[] arr = new long[N];
		
		boolean flag = false;
		
		for(int i=0;i<N;i++){
			
			arr[i] = s.nextLong();
		}
		int min;
	
		
		for(int i=0;i<M;i++){
			min =i;
			
			for(int j=i+1;j<arr.length;j++){
				
				if(arr[j]<arr[min]){
					min=j;
				}	
				
			}
			long temp=arr[min];
			arr[min]=arr[i];
			arr[i]=temp;	
		
		}
		for(int j=0;j<arr.length;j++){
			System.out.print(arr[j]+" ");
		}
		
		

	}

}
