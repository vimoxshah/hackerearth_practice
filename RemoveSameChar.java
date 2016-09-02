import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;


public class RemoveSameChar {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String st = br.readLine();
		
		
		char[] ch = st.toCharArray();
		//char[] ch1 = null;
		StringBuilder sb = new StringBuilder();
		List<Character> set = new ArrayList<Character>();
	//	Iterator<Character> it = set.iterator();
		for(int i=0;i<ch.length;i++) {
			
			
			if(!set.contains(ch[i])) {
				set.add((ch[i]));
			}
			
		}
		for(Character c: set) {
			sb.append(c);
		}
		
		System.out.println(sb.toString());
		
	

	}

}
