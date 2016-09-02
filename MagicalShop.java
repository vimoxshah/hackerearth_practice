import java.util.Scanner;


public class MagicalShop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		
		long a = s.nextInt();
		long b= s.nextInt();
		String str = s.next();
		
		char[] ch = str.toCharArray();
		long ans=0;
		
		for(long i=0;i<ch.length;i++){
			
			
			
			if(ch[(int) i] == '1'){
				ans = (ans+a)%b;
			}
			a=(a*a)%b;
		}
		System.out.println(ans);
		
	
	}

}
