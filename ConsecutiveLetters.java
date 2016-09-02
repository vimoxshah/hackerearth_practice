import java.util.Arrays;
import java.util.Scanner;


public class ConsecutiveLetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		int c = s.nextInt();
		String str,str1;
		
		for(int i=0;i<c;i++){
			StringBuilder sb =new StringBuilder();
			
			//sb=sb.append(s.next());
			str = s.next();
			
			str1="";
			//System.out.println(sb.toString());
		
				
			for(int k=1;k<str.length();k++){
				//sb.append(str);
				if(str.charAt(k)!=str.charAt(k-1)){
					str1=str1+str.charAt(k);	
				}
				//sb.delete(0, sb.length());
			}
			
		
		System.out.println(str.charAt(0)+str1);
		
		}

	}
}