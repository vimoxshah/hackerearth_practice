import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Fibo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		List<Long> list = new ArrayList<>();
		int tc = s.nextInt();
		
		for(int i=0;i<tc;i++) {
			
			long n= s.nextLong();
			
			 long n1=0,n2=1,n3=0;
			 long count=n;  
			 for(long j=2;j<count;++j)    
			 {    
			  if(n3<count) {	 
			  n3=n1+n2;  
			  list.add(n3);
			     
			  n1=n2;    
			  n2=n3;    
			  }
			  if(n3>count) {
				  break;
			  }
			  
			 } 
			 BigInteger sum=BigInteger.ZERO;
			for(long k=1;k<n;k++) {
				if(!list.contains(k)) {
					sum=sum.add(BigInteger.valueOf(k));
				}
				
			}
			if(sum.isProbablePrime(9)) {
				System.out.println("Tic");
			}
			else if(sum.mod(BigInteger.valueOf(2))==BigInteger.ZERO) {
				System.out.println("Tac");
			}
			else if((sum.mod(BigInteger.valueOf(2)) != BigInteger.ZERO)&& (!sum.isProbablePrime(9))){
				System.out.println("Toe");
			}
			
		}
	}

}
