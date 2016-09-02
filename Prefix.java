import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class Prefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		long n = s.nextLong();
		
		List<String> arr = new ArrayList<String>(Arrays.asList("1","2","3","4","5","6","7","8","9"));
		String[] sa = new String[100007];
		String[] sa1 = new String[100007];
		;
		for(int i=1;i<=9;i++) {
			sa[i]=String.valueOf(i);
		}
		//System.out.println(Arrays.toString(sa));
		/*arr.add(1L);
		arr.add(2L);
		arr.add(3L);
		arr.add(4L);
		arr.add(5L);
		arr.add(6L);
		arr.add(7L);
		arr.add(8L);
		arr.add(9L);*/
		long n1;
		int c=0;
		int k=1;
		String str = sa[1];
		String str1;
		for(int m=1;m<=n;m++) {
			for(int i=1;i<=9;i++) {
				str=sa[i];

				for(int j=1;j<=9;j++) {
			
					sa1[k]= str.concat(String.valueOf(j));
					k++;
					}
				
				}
			
		}	 
		System.out.println(Arrays.toString(sa1));
	}
}
