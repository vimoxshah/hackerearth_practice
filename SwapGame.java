import java.util.Arrays;
import java.util.Scanner;


public class SwapGame {
	
	static Scanner s = new Scanner(System.in);
	static int K= s.nextInt();
	static StringBuilder[] arr = new StringBuilder[ (int) (K+1)];
	

	public static void main(String[] args) {
			
			String str = s.next();
			char[] ch = str.toCharArray();
			StringBuilder sb =new StringBuilder();
			
			sb.append(str);
			arr[0]= sb;
			
			for(int i=0;i<K;i++){
			arr[i+1]=swapGame(arr[i]);
			
			}
			System.out.println(arr[(int) (K)]);
			 
			
			
			
			
		

	}

	private static StringBuilder swapGame(StringBuilder sb) {
		
		 StringBuilder sb1 =new StringBuilder();
		 StringBuilder sb2 =new StringBuilder();
		 StringBuilder sb3 =new StringBuilder();
		 
		for(int j=0;j<sb.length();j=j+2){
			sb1=sb1.append(sb.charAt(j));
			
		}
		for(int j=1;j<sb.length();j=j+2){
			sb2=sb2.append(sb.charAt(j));
		}
		sb2.reverse();
		
		sb3= sb1.append(sb2);
		sb=sb3;
		
		return sb;
	}
		
	

}
