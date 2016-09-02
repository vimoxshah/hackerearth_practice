import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Pattern;


public class UPup {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String st = br.readLine();
		StringBuilder sb = new StringBuilder();
		
		String[] tokens = st.split(" ");
		
		for(int i=0;i<tokens.length;i++) {
			
			if(tokens[i].length()>1) {
			//tokens[i]= ;
			sb.append(tokens[i].substring(0, 1).toUpperCase()+tokens[i].substring(1,tokens[i].length())+" ");
		//	sb.append(" ");
			}
			else {
				sb.append(tokens[i].toUpperCase()+" ");
			}
			
		}
		//System.out.println(Arrays.toString(tokens));
		System.out.println(sb.toString());
	}

}
