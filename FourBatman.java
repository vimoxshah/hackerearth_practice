import java.util.Arrays;
import java.util.Scanner;


public class FourBatman {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner s = new Scanner(System.in);
	      
		 int tc =s.nextInt();
		 
		 
		 for(int i=0;i<tc;i++){
			 int ans=1;
			 
			 int n= s.nextInt();
			 
			 int[] arr = new int[n+1];
			 Integer[] arr1 = new Integer[n+1];
			 
			 for(int j=1;j<=n;j++){
					
				arr1[j]=arr[j] = s.nextInt();
					
			}	
			 Arrays.sort(arr); 
			 	
			 	int n1= s.nextInt();
				int n2= s.nextInt();
				
				int b1 = arr[n1];
				int b2 = arr[n2];
				
			
				int k= Arrays.asList(arr1).indexOf((b1));
				int m =Arrays.asList(arr1).indexOf((b2));
				
				//System.out.println("Val k"+k + " "+m);
				
				for(int y=k;y<=m;y++){
					ans = ans*arr1[y];
				}
				 System.out.println(ans);
		 }
		
	}

}
