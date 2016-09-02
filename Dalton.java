import java.util.Scanner;


public class Dalton {
	public static void main(String args[]){
		
		Scanner s = new Scanner(System.in);
		
		int tc;
		tc= s.nextInt();
		
		for(int i=0;i<tc;i++){
			int n=s.nextInt();
			
			if(n%2==0){
				int n1 = n/2;
				System.out.println(n1 +" "+n1);
			}
			else{
				int n1 = n/2;
				int n2=n1+1;
				System.out.println(n1 + " "+n2 );
			}
		}
		
	}
}
