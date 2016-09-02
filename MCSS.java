import java.util.Arrays;
import java.util.Scanner;


public class MCSS {
	
	static void MCSSCount(int[] arr) {
		
		int[] M = new int[arr.length];
		int[] b = new int[arr.length];
		M[0]=arr[0];
		b[0]=0;
		int max=arr[0];
		int k=0;
		for(int i=1;i<arr.length;i++) {
			
			if(M[i-1]>0) {
				M[i]=M[i-1]+arr[i];
				b[i]=i-1;
			}
			else {
				M[i]=arr[i];
				b[i]=i;
			}
			
			if(M[i]>max) {
				max=M[i];
				k=i;
			}
			
		}
	//	System.out.println("Range   "+b[k]+"\t"+k+"\t"+"value:"+max);
		System.out.println(max);
		
	}

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int tc = s.nextInt();
		
		for(int i=0;i<tc;i++) {
			
			int n = s.nextInt();
			int[] arr  =new int[n];
			
			for(int j=0;j<n;j++) {
				arr[j]=s.nextInt();
			}
		//	System.out.println(Arrays.toString(arr));
			
			MCSSCount(arr);
			
		}

	}

}
