import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

import java.util.Collections;
import java.util.Scanner;


public class ReverseSort {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		 BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
		 String line = br.readLine();
	     int tc = Integer.parseInt(line);
		 
		 for(int i=0;i<tc;i++){
			 
			int n=Integer.parseInt(br.readLine());
			
			int[] arr = new int[n];
			String str = br.readLine();
			int k=0;
			for(String c:str.split(" ")){
				
				arr[k]=Integer.parseInt(c);
				k++;
			}
			Arrays.sort(arr);
			for(int m=n-1;m>=0;m--){
				  
				 System.out.print(arr[m]+" ");
			 }
			System.out.println();
		 }
		   
		
		 
		 
	}

}
