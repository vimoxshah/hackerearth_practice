import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.text.Normalizer;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.regex.Pattern;


public class Benny {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		for(int i=0;i<n;i++) {
			
			String line1 = br.readLine();
			
			 String nfdNormalizedString = Normalizer.normalize(line1, Normalizer.Form.NFD); 
			    Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
			    String line= pattern.matcher(nfdNormalizedString).replaceAll("");
			
			String str1;
			String s1= line.replaceAll("[A-Za-z][0-9]+","");
			//System.out.println(s1);
			String str = s1.replaceAll("[^\\d$\\s]", "#");
			
			String[] tokens = str.split(" ");
			
			String sb="";
			int m=0;
			/*while(tokens[m].startsWith("$") ) {
				sb = sb+tokens[m];
				m++;
			}*/
			
			for(int j=0;j<tokens.length;j++) {
				
				if(tokens[j].startsWith("$")) {
					sb=sb+(tokens[j].toString());
					for(int k=j+1;k<tokens.length;k++) {
						if(!tokens[k].startsWith("#")) {
							sb=sb+(tokens[k].toString());
						}
						else 
							break;
						
					}
					break;
				}
				
			}
			//System.out.println(sb);
			String	sp=sb.replace("$", "");
			
			
			
			sp = sp.replaceAll("^0+", "");
			
			
			
			char[] ch =sp.toCharArray();
			//System.out.println(Arrays.toString(ch));
			if(ch.length==0) {
				sp="0";
			}
			System.out.println("$"+sp);
			
		/*	
			System.out.println(str);
			str1= str.replaceAll("^0+", "");
			
			char[] ch =str1.toCharArray();
			if(ch.length==0) {
				str1="0";
			}
			
			StringBuilder sb =new StringBuilder();
			sb.append("$");
			String s = sb.append(str1).toString();
			System.out.println(s);*/
			
			
			
		}
		

	}

}
