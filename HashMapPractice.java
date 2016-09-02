import java.util.Map;
import java.util.Scanner;


public class HashMapPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		
		int nc = s.nextInt();
		java.util.Map<Integer, String> hm = new java.util.HashMap<Integer,String>();
		for(int i =0;i<nc;i++){
			
			hm.put(s.nextInt(),	 s.next());
			
		}
		int n = s.nextInt();
		
		for(int i=0;i<n;i++){
			int k = s.nextInt();
			
			 System.out.println(hm.get(k));
			
			
		}
	}

}
