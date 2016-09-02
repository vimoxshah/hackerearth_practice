import java.util.Scanner;


public class MakingChange {
	
	static void makeChange(int[] deno,int c) {
		
		int[] M = new int[c+1];
		int[] b = new int[c+1];
		
		M[0]=0;
		
		for(int j=1;j<=c;j++) {
			int min=Integer.MAX_VALUE;
			System.out.println(j);
			b[j]=deno[1];
			
			for(int i=0;i<deno.length;i++) {
				
				if(j-deno[i]>=0 && M[j-deno[i]]<min) {
					min = M[j-deno[i]];
					b[j]=deno[i];
				}
			}
			M[j]=1+min;
		}
		System.out.println("Min coins  "+M[c]);
		PrintCoins(b, c);
	}

	 static void PrintCoins(int[] b, int c) {
		
		 if(c==0) {
			 return;
		 }
		 System.out.println(b[c]);
		 
		PrintCoins(b, c-b[c]); 
		
	}

	public static void main(String[] args) {
	
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int[] deno = new int[n];
		for(int j=0;j<n;j++) {
			deno[j]=s.nextInt();
		}
		int c = s.nextInt();
		
		makeChange(deno, c);
		
		

	}

}
