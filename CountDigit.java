/* IMPORTANT: Multiple classes and nested static classes are supported */


// * uncomment this if you want to read input.
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;


class TestClass {
    public static void main(String args[] ) throws Exception {
        
        // * Read input from stdin and provide input before running
    	int z,o,t,th,f,fi,s,se,e,n,te,n2 = 0 ;
    
    	z=o=t=th=f=fi=s=se=e=n=te=0;
       
    	Scanner s1 = new Scanner(System.in);
    	
        String line = s1.next();
       // System.out.println(line.length());
        
        for(int i=0;i<line.length();i++){
        
        
        if(line.charAt(i)=='0'){
        	z=z+1;
        
        }
        else if(line.charAt(i)=='1'){
        	o =o+1;
        }
        else if(line.charAt(i)=='2'){
        	t=t+1;
        }
        else if(line.charAt(i)=='3'){
        	th=th+1;
        }
        else if(line.charAt(i)=='4'){
        	f=f+1;
        }
        else if(line.charAt(i)=='5'){
        	fi=fi+1;
        }
        else if(line.charAt(i)=='6'){
        	s=s+1;
        }
        else if(line.charAt(i)=='7'){
        	se=se+1;
        }
        else if(line.charAt(i)=='8'){
        	e=e+1;
        }
        else if(line.charAt(i)=='9'){
        	n=n+1;
        }
       }
        
    
    	   System.out.println(0 +" " +z);
    	   System.out.println(1 +" " +o);
    	   System.out.println(2 +" " +t);
    	   System.out.println(3 +" " +th);
    	   System.out.println(4 +" " +f);
    	   System.out.println(5 +" " +fi);
    	   System.out.println(6 +" " +s);
    	   System.out.println(7 +" " +se);
    	   System.out.println(8 +" " +e);
    	   System.out.println(9 +" " +n);
    	   
       }
        

       
    }

