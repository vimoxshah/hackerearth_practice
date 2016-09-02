import java.util.Scanner;

public class GirlfriendDemand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		String str = s.next();
		long len = str.length();
		
		//str  =new StringBuilder(str).insert(0, "#").toString();
		
		
		int Q = s.nextInt();
		
		for(int i=1;i<=Q;i++) {
			long n1 = s.nextLong()-1;
			long n2 = s.nextLong()-1;
			long n3,n4;
			
			if(n1>len) {
				n1= (n1%len);
				
			}
			if(n2>len) {
				n2= (n2%len);
				
			}
			
		//	System.out.println(n3 +""+n4);
			
			if(str.charAt((int) n1) == str.charAt((int) n2)) {
				System.out.println("Yes");
			}
			else {
				System.out.println("No");
			}
			
		}
	}

}
