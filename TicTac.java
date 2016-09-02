import java.util.Arrays;
import java.util.Scanner;


public class TicTac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		long tc = s.nextLong();
		
		for(int i=0;i<tc;i++) {
			String str = s.next();
			
			char[] ch = str.toCharArray();
			
			Arrays.sort(ch);
			str= String.valueOf(ch);
			
			System.out.println(str.toString());
			
			//System.out.print(Arrays.toString(ch));
			
		}

	}

}
