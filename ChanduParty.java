import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;


public class ChanduParty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		int tc = s.nextInt();
		TreeSet<String> st = new TreeSet<String>();
		for(int i=0;i<tc;i++) {
			int n= s.nextInt();
			
			
			
			for(int j=0;j<n;j++) {
				String str = s.next();
				
				if(!st.contains(str)) {
					st.add(str);
				}
			}
			for(String sc : st) {
				System.out.println(sc);
			}
			
		}
		

	}

}
