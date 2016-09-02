import java.util.Scanner;


public class Hamming {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s =new Scanner(System.in);
		int tc = s.nextInt();
		
		for(int i=0;i<tc;i++) {
			
			long n1 = s.nextLong();
			long n2 = s.nextLong();
			
			
			String b1 = Long.toBinaryString(n1);
			String b2 = Long.toBinaryString(n2);
			
			//System.out.println(b1+"\t"+b2);
			long len,len1,l;
			len = b1.length();
			len1= b2.length();
			l=len;
			
			if(len>len1) {
				l=len;
				StringBuilder sb = new StringBuilder(b2);
				len1 = len-len1;
				for(int j=0;j<len1;j++) {
					sb.insert(j, "0");	
					b2= sb.toString();
				}
				
			}
			else if(len1>len) {
			
				l=len1;
				StringBuilder sb = new StringBuilder(b1);
				len = len1-len;
				for(int j=0;j<len;j++) {
					sb.insert(j, "0");
					b1=sb.toString();
				}
				
			}
			
			int r=0;
			
			for(int j=0;j<l;j++) {
				if(b1.charAt(j)!=b2.charAt(j)) {
					r++;
				}
				
			}
			
			System.out.println(r);
		}
		

	
	}
}
