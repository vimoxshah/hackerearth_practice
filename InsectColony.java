import java.io.BufferedReader;
import java.io.InputStreamReader;
 
class InsectColony {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int t = Integer.parseInt(line);
        int n;
        int odd;
        String[] str;
        for (int i = 0; i < t; i++) {
        	odd = 0;
        	str = br.readLine().split(" ");
        	n = Integer.parseInt(str[0]);
        	for (int j = 1; j <= n; j++) {
        		if (Integer.parseInt(str[j])%2 != 0) {
        			odd++;
        		}
        	}
        	if (odd%2 == 0) {
        		System.out.println("Yes");
        	} else System.out.println("No");
        }
    }
}