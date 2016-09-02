import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class Boo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int n1 = s.nextInt();
		int sum=0;
		for(int i=0;i<n1;i++) {
			sum+=s.nextInt();
			
		}
		System.out.println(sum);
		int ans =sum/2+sum%2;
		
		System.out.println(ans);
		
	}

}