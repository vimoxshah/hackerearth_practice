import java.util.Arrays;
import java.util.Scanner;


public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Scanner s = new Scanner(System.in);
		int N= s.nextInt();
		
		long[] arr = new long[N+1];
		long[] arr1 = new long[N+1];
		
		for(int i=1;i<=N;i++){
			
			arr1[i]=arr[i] = s.nextLong();
			
		}
		
		
		
		for(int i =1;i<=arr1.length-1;i++){
			
		            long valueToSort = arr1[i];
		            int j = i;
		            while (j > 0 && arr1[j - 1] > valueToSort) {
		                arr1[j] = arr1[j - 1];
		                j--;
		            }
		            arr1[j] = valueToSort;
		        }
		//System.out.println(Arrays.toString(arr));
		//System.out.println(Arrays.toString(arr1));
		for(int j=1;j<=arr.length-1;j++){
			for(int k=1;k<=arr1.length-1;k++){
				
				if(arr[j]==arr1[k]){
					System.out.print(k+" ");
				}
			}
		}

	}

}
