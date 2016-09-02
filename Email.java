import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Email {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int tc = Integer.parseInt(br.readLine());
		
		for(int i=0;i<tc;i++) {
			
			String str =br.readLine();
			String[] tokens = str.split(" ");
		
			
			 List<String> set = new ArrayList<>();
			 
		        for (int j=0; j<tokens.length; j++)
		        {
		            
		            if (!set.contains(tokens[j]))
		            {
		                set.add(tokens[j]);
		              //  System.out.print(tokens[j] + " ");
		              
		            }
		        }
		        
		        StringBuilder sb = new StringBuilder();
		        for (String s1 : set)
		        {
		            sb.append(s1);
		            sb.append(" ");
		        }
		        System.out.println(sb);
		}
		
	}
}
