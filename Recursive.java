import java.util.Scanner;


public class Recursive {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		int y = s.nextInt();
		
		
		
		if(rcrsv(x,y)%1000 <=9){
		System.out.println(String.format("%03d", rcrsv(x,y)%1000));
		}
		else {
			System.out.println(rcrsv(x,y)%1000);
		}

}

	static  int rcrsv(int x, int y) throws Exception {
		// TODO Auto-generated method stub
		
		
		if(x==0){
			 return (y+1)%1000;
		}
		else if(x>0 && y==0){
			return rcrsv(x-1,1);
		}
		else if(x>0 && y>0){
			 return rcrsv(x-1,rcrsv(x,y-1));
			 
		}
		else{
			return 0;
		}
	
	}
	}

	