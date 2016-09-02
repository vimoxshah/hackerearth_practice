import java.util.Arrays;
import java.util.Scanner;


public class WebBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		int tc = s.nextInt();
		
		for(int i=0;i<tc;i++){
			
			String str = s.next();
			int ja,oa;
			oa= str.length();
		
			String[] tokens = str.split("\\.");	
			int l1 = tokens[1].length();
			String a= String.valueOf(oa);
			ja=tokens[1].toLowerCase().replaceAll("a|e|i|o|u|", "").length()+4;
			String b= String.valueOf(ja);
			System.out.println(b+"/"+a);
			
			
		}
		

	}

}
