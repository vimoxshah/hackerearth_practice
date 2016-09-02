
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;


class SumOfPowers {
    public static void main(String args[] ) throws Exception {
        
         
         Scanner s = new Scanner(System.in);
		
		int tc;
		tc= s.nextInt();
		
		for(int i=0;i<tc;i++){
			int n=s.nextInt();
			
			System.out.println(isPower(n));
		}
    }
   static String isPower(int n){
   	
   	int sum=1;
   	int ub=1;
   	int lb=1;
   	
   	int max = (int) Math.floor(Math.sqrt(n));
	if(n==2){
   		return "Yes";
   	}
   	while(sum!= n){
   		
   		if(sum<n){
   			
   			ub++;
   			sum+=ub*ub;
   			//System.out.println("LT"+ sum+ "\t"+ ub );
   		}
   		else if(sum>n){
   			
   			sum-=lb*lb;
   			lb++;
   			//System.out.println("GT"+sum+ "\t"+ lb );
   		}
   		
   		if(ub>max){
   			return "No";
   		}
   	}
   	return "Yes";
   	
   } 
}
