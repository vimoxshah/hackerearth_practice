import java.util.Scanner;


public class ChanduAndInterns {

	public static void main(String[] args){
		
		Scanner s = new Scanner(System.in);
		long tc = s.nextInt();
		
		int c=0;
		while(tc-- !=0){
			c=0;
			long n = s.nextInt();
			
			for(long j=1;j*j<(n);j++){
				
				if(n%j==0){
					c=c+2;
					
				if(c>=4)
					break;
				}
			}
			if(c<4){
				System.out.println("NO");
			}
			else {
				System.out.println("YES");
			}
			
		}
	}
}
