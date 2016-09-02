import java.util.Arrays;
import java.util.Scanner;


public class XennyAndClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		int tc= s.nextInt();
		
		for(int i=0;i<tc;i++){
			
			int n=s.nextInt();
			String str =s.next();
			char[] ch =str.toCharArray();
			StringBuilder sb = new StringBuilder();
			sb.append(str);
			int c=0;
		
			
			for(int j=0;j<ch.length-1;j++){
				if(ch[j]=='B' && ch[j+1]=='B'){
					//sb.setCharAt(j+1, 'G');
					ch[j+1]='G';
				//	System.out.println(Arrays.toString(ch));
					c++;
				}
				else if(ch[j]=='G' && ch[j+1]=='G'){
					ch[j+1]='B';
				//	System.out.println(Arrays.toString(ch));
					c++;
				}
					
				
			}
			System.out.println(c/2);
		}
	
	}

}
