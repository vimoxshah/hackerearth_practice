import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class CountSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		String c = s.next();
		String s1 = s.next();
		
		Pattern p = Pattern.compile(c);
		Matcher m = p.matcher(s1);
		int a=0;
		
		while(m.find()){
			a++;
		}
		System.out.println(a);
		

	}

}
