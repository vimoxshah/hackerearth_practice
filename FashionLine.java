import java.math.BigInteger;
import java.util.Scanner;


public class FashionLine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		int tc = s.nextInt();
		int count=0;
		for(int i=0; i<tc;i++){
			
			int N=s.nextInt();
			int K= s.nextInt();
			int L= s.nextInt();
			int R = s.nextInt();
			
			String str= s.next();
			String spcl_str = s.next();
			
			
			char[] spcl = spcl_str.toCharArray();
			System.out.println("Char spcl "+  spcl);
		
			for(int j=0 ;j<N;i++){
				
				for(int k=j+1;k<K;k++){
					
					String t;
					t= str.substring(j, k);
					//System.out.println(t);
					
					if(t.contains(spcl_str)){
						count+=1;
						
					}
					
				}
				
			}

		}System.out.println(count);
	}
}